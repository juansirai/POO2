package practicaOO2.ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class UsuarioTest {
	
	Usuario james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario();
		guido = new Usuario();
		james.setName("James");
		guido.setName("Guido");		
	}
	
    @Test
    public void testTwittear() {
        Tweet t = james.twitear("Hola");
        assertEquals(james.lastTweet(), t);
        Tweet t_nulo = james.twitear("");
        assertNull(t_nulo);
        Tweet t_largo = james.twitear("sdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqasdfgtrewqa");
        assertEquals(james.lastTweet(), t_largo);
        Tweet t_erroneo = james.twitear("We think a mix of manufacturing and innovative engineering might be the key to unlock the global demand for carbon fiber composites.\r\n"
        		+ "\r\n"
        		+ "Here’s to carbon fiber.\r\n"
        		+ "\r\n"
        		+ "Posted in Carbon Fiber\r\n"
        		+ "\r\n"
        		+ "Source: Carbon Films\r\n"
        		+ "\r\n"
        		+ "Further Reading: Carbon Films\r\n"
        		+ "\r\n"
        		+ "Other Posts\r\n"
        		+ "\r\n"
        		+ "[adrotate group=”4″]\r\n"
        		+ "\r\n"
        		+ "Commentss");
        assertNull(t_erroneo);
    }
}
