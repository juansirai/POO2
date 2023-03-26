package practicaOO2.ejercicio04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTopografiaAgua {
	private TopografiaAgua topografiaAgua;
	
	@BeforeEach
	void setUp() throws Exception{
		topografiaAgua = new TopografiaAgua();
	}
	
	@Test
	public void testProporcion() {
		assertEquals(1, topografiaAgua.calcularProporcionAgua());
	}
	
	@Test
	public void testIgualdad() {
		TopografiaAgua a2 = new TopografiaAgua();
		TopografiaTierra t1 = new TopografiaTierra();
		assertTrue(topografiaAgua.esIgualA(a2));
		assertFalse(topografiaAgua.esIgualA(t1));
	}
}
