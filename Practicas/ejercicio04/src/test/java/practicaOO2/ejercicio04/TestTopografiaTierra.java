package practicaOO2.ejercicio04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTopografiaTierra {
	private Topografia topografiaTierra;
	
	@BeforeEach
	void setUp() throws Exception{
		topografiaTierra = new TopografiaTierra();
	}
	
	@Test
	public void testProporcion() {
		assertEquals(0, topografiaTierra.calcularProporcionAgua());
	}
}
