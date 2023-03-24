package practicaOO2.ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetweetTest {
	Tweet t1, t2;
	Retweet rt1;
	
	@BeforeEach
	void setUp() throws Exception {
		t1 = new Tweet("Hola");
		t2 = new Tweet("Hola2");
		rt1 = t1.retweetear();
	}
	
	@Test
	public void testOrigen() {
		assertEquals(t1, rt1.getOrigen());
		assertFalse(t2.equals(rt1.getOrigen()));
	}
	
}
