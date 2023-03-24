package practicaOO2.ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	Twitter sistema;
	Usuario u1, u2, u3;
	
	@BeforeEach
	void setUp() throws Exception{
		sistema = new Twitter();
		u1 = new Usuario("Juan");
		u2 = new Usuario("Pedro");
		u3 = new Usuario("Juan");
	}
	
	@Test
	public void agregarUsuario() {
		sistema.agregarUsuario(u1);
		sistema.agregarUsuario(u2);
		assertEquals(2, sistema.getUsuarios().size());
		assertFalse(sistema.agregarUsuario(u3));
	}
	
	@Test
	public void eliminarUsuario() {
		Tweet t1 = u1.twitear("Hola");
		u1.twitear("Hola2");
		u2.twitear("Hola#");
		u2.retwitear(t1);
		sistema.agregarUsuario(u1);
		sistema.agregarUsuario(u2);
		
		assertEquals(4, sistema.getTweetsSistema().size());
		sistema.eliminarUsuario(u1);
		assertEquals(2, sistema.getTweetsSistema().size());
	}

}
