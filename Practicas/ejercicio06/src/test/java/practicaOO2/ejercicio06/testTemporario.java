package practicaOO2.ejercicio06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testTemporario {
	private Temporario t1, t2, t3;
	
	@BeforeEach
	void setUp() throws Exception{
		t1 = new Temporario(); // sin nada
		t2 = new Temporario(true, 3); // casado con hijos
		t3 = new Temporario(300, true, 3); // casado con hijos y horas
	}
	
	@Test
	public void testBasico() {
		assertEquals(20000, t1.calcularBasico());
		assertEquals(20000, t2.calcularBasico());
		assertEquals(110000, t3.calcularBasico());
	}
	
	@Test
	public void testAdicional() {
		assertEquals(0, t1.calcularAdicional());
		assertEquals(11000, t2.calcularAdicional());
		assertEquals(11000, t3.calcularAdicional());
	}
	
	@Test
	public void testDescuento() {
		assertEquals(2600, t1.calcularDescuento());
		assertEquals(3150, t2.calcularDescuento());
		assertEquals(14850, t3.calcularDescuento());
	}
	
	@Test
	public void testSueldo() {
		assertEquals(17400, t1.sueldo());
		assertEquals(27850, t2.sueldo());
		assertEquals(106150, t3.sueldo());
	}
}
