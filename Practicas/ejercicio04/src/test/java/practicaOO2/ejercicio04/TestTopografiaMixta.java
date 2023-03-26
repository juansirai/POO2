package practicaOO2.ejercicio04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTopografiaMixta {
	private TopografiaMixta m1;
	private TopografiaMixta m2;
	private TopografiaMixta m3;

	/*# TODO: preguntar por que si arriba defino Topografia como tipo de dato para m1, m2, m3, luego no me deja acceder al metodo addComponent*/
	
	@BeforeEach
	void setUp() throws Exception{
		m1 = new TopografiaMixta();
		m2 = new TopografiaMixta();
		m3 = new TopografiaMixta();
	}
	
	@Test
	public void testProporcionAgua() {
		
		/*testing a topografy with 4 base parts, half water*/
		Topografia a1 = new TopografiaAgua();
		Topografia a2 = new TopografiaAgua();
		Topografia t1 = new TopografiaTierra();
		Topografia t2 = new TopografiaTierra();
		m1.addComponent(a1);
		m1.addComponent(a2);
		m1.addComponent(t1);
		m1.addComponent(t2);
		assertEquals(0.5, m1.calcularProporcionAgua());
		
		/*testing a topografy with 3 base parts (1 water) and 1 mix part (2 water + 2 earth)*/
		Topografia a3 = new TopografiaAgua();
		Topografia t3 = new TopografiaTierra();
		Topografia t4 = new TopografiaTierra();
		m2.addComponent(a3);
		m2.addComponent(t3);
		m2.addComponent(t4);
		m2.addComponent(m1);
		assertEquals(0.375, m2.calcularProporcionAgua());
		
		/*testing a topografy with 3 base parts (1 water) and the previous mix topografy as the fourth part*/
		
		Topografia a4 = new TopografiaAgua();
		Topografia t5 = new TopografiaTierra();
		Topografia t6 = new TopografiaTierra();
		
		m3.addComponent(a4);
		m3.addComponent(t6);
		m3.addComponent(t5);
		m3.addComponent(m2);
		assertEquals(0.34375, m3.calcularProporcionAgua());
		
	}
}
