package practicaOO2.ejercicio06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testPasante {
	private Pasante p1, p2;
	
	@BeforeEach
	void setUp() throws Exception{
		p1 = new Pasante(); // pasante sin examenes
		p2 = new Pasante(5); // pasante con 5 examenes
	}
	
	@Test
	public void testBasico() {
		assertEquals(20000, p1.calcularBasico());
		assertEquals(20000, p2.calcularBasico());
	}
	
	@Test
	public void testAdicional() {
		assertEquals(0, p1.calcularAdicional());
		assertEquals(5 * 2000, p2.calcularAdicional());
	}
	
	@Test
	public void testDescuento() {
		assertEquals(2600, p1.calcularDescuento());
		assertEquals(3100, p2.calcularDescuento() );
	}
	
	@Test
	public void testSueldo() {
		assertEquals(17400, p1.sueldo());
		assertEquals(26900, p2.sueldo());
	}

}
