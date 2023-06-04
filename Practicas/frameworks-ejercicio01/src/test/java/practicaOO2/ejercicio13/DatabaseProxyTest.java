package practicaOO2.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
	private DatabaseProxy database;
	private Usuario u1;
	
	@BeforeAll
	static void setUpLogger() throws SecurityException, IOException {
		Handler handlerUpper = new FileHandler("loggerUpper.txt");
		handlerUpper.setFormatter(new FormatterUpper());
		Handler handlerJson = new FileHandler("loggerJson.txt");
		handlerJson.setFormatter(new FormatterJson());
		Logger.getLogger("proxy").addHandler(handlerJson);
	}
	
	@BeforeEach
	void setUp() throws Exception{
		this.u1 = new Usuario("Juan","callefalsa123");
		this.database = new DatabaseProxy();
		this.database.registrarUsuario(u1);
	}
	
	@Test
	public void testRegistrarUsuario() {
		Usuario u2 = new Usuario("Pedro", "callefalsa123");
		Usuario duplicado = new Usuario("Juan","callefalsa123");
		
		assertEquals(1, this.database.getUsuarios().size());
		this.database.registrarUsuario(u2);
		assertEquals(2, this.database.getUsuarios().size());
		
		this.database.registrarUsuario(duplicado);
		assertEquals(2, this.database.getUsuarios().size());
	}
	
	@Test
	void testGetSearchResultsSesionIniciada() {
		this.database.iniciarSesion("Juan", "callefalsa123");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }
	
	@Test
	void testGetSearchResultsSesionNoIniciada() {
		this.database.iniciarSesion("Juan", "callefalsa124");
        assertNull(this.database.getSearchResults("select * from comics where id=1"));
        assertNull(this.database.getSearchResults("select * from comics where id=10"));
        
        this.database.iniciarSesion("Pedro", "callefalsa123");
        assertNull(this.database.getSearchResults("select * from comics where id=1"));
        assertNull(this.database.getSearchResults("select * from comics where id=10"));
    }
	
	@Test
	void testCerrarSesion() {
		this.database.iniciarSesion("Juan", "callefalsa123");
		assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
		this.database.cerrarSesion("Juan", "callefalsa123");
		assertNull(this.database.getSearchResults("select * from comics where id=1"));
	}
	
	@Test
    void testInsertNewRowSesionIniciada() {
        assertEquals(-1, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertNull(this.database.getSearchResults("select * from comics where id=3"));
        
        this.database.iniciarSesion("Juan", "callefalsa123");
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }

}
