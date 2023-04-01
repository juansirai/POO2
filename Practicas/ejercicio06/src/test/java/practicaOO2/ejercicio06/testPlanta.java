package practicaOO2.ejercicio06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testPlanta {
	private Planta p1, p2, p3, p4, p5;
	
	@BeforeEach
	void setUp() throws Exception{
		p1 = new Planta();  // sin hijos, soltero, nuevo
		
		p2 = new Planta();  // con hijos
		p2.setHijos(3);
		
		p3 = new Planta(); // casado
		p3.setCasado(true);
		
		p4 = new Planta(); // mucha antiguedad
		p4.setAntiguedad(20);
		
		p5 = new Planta(true, 3, 20); //todo
		
	}
	
	@Test
	public void testBasico() {
		assertEquals(50000, p1.calcularBasico());
		assertEquals(50000, p2.calcularBasico());
		assertEquals(50000, p3.calcularBasico());
		assertEquals(50000, p4.calcularBasico());
		assertEquals(50000, p5.calcularBasico());
	}
	
	@Test
	public void testAdicional() {
		assertEquals(0, p1.calcularAdicional());
		assertEquals(6000, p2.calcularAdicional());
		assertEquals(5000, p3.calcularAdicional());
		assertEquals(40000, p4.calcularAdicional());
		assertEquals(51000, p5.calcularAdicional());
	}
	
	@Test
	public void testDescuento() {
		assertEquals(6500, p1.calcularDescuento());
		assertEquals(6800, p2.calcularDescuento());
		assertEquals(6750, p3.calcularDescuento());
		assertEquals(8500, p4.calcularDescuento());
		assertEquals(9050, p5.calcularDescuento());
	}
	
	@Test
	public void testSueldo() {
		assertEquals(43500, p1.sueldo());
		assertEquals(49200, p2.sueldo());
		assertEquals(48250, p3.sueldo());
		assertEquals(81500, p4.sueldo());
		assertEquals(91950, p5.sueldo());
	}
	

}
