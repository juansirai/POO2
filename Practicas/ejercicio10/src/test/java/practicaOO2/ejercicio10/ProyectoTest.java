package practicaOO2.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	private Proyecto p1, p2;
	
	@BeforeEach
	void setUp() throws Exception{
		this.p1 = new Proyecto("Vacaciones de Invierno",LocalDate.ofYearDay(2022, 1),
								LocalDate.ofYearDay(2022, 20),"salir con amigos",3,20);
		this.p1.aprobarEtapa();
		
		this.p2 = new Proyecto("Vacaciones de Invierno",LocalDate.ofYearDay(2022, 1),
				LocalDate.ofYearDay(2022, 20),"salir con amigos",3,0);
	}
	
	@Test
	public void testAprobarEtapa() {
		
		//testeamos que hubiera pasado de querer aprobar el proyecto con costo cero
		Exception exception = assertThrows(RuntimeException.class, () -> {p2.aprobarEtapa();});
		String expectedMessage = "El precio del proyecto es cero.";
		String realMessage1 = exception.getMessage();
		assertEquals(expectedMessage, realMessage1);
		
		//ahora si testeamos que nuestro proyecto esté efectivamente en etapa en evaluacion
		
		p1.modificarMargen(0.1);
		assertEquals(1219.8, p1.precioProyecto(),0.05);
		p1.modificarMargen(0.16);
		assertEquals(1219.8, p1.precioProyecto(),0.05);
		p1.modificarMargen(0.11);
		assertEquals(1265.4,p1.precioProyecto(),0.05);
		p1.modificarMargen(0.15);
		assertEquals(1311,p1.precioProyecto(),0.05);
		
		//pasamos a etapa confirmada
		p1.aprobarEtapa();
		p1.modificarMargen(0.1);
		assertEquals(1311, p1.precioProyecto(),0.05);
		p1.modificarMargen(0.16);
		assertEquals(1311, p1.precioProyecto(),0.05);
		p1.modificarMargen(0.11);
		assertEquals(1311,p1.precioProyecto(),0.05);
		p1.modificarMargen(0.15);
		assertEquals(1311,p1.precioProyecto(),0.05);	
		
		//no cambia etapa
		p1.aprobarEtapa();
		p1.modificarMargen(0.1);
		assertEquals(1311, p1.precioProyecto(),0.05);
		p1.modificarMargen(0.16);
		assertEquals(1311, p1.precioProyecto(),0.05);
		p1.modificarMargen(0.11);
		assertEquals(1311,p1.precioProyecto(),0.05);
		p1.modificarMargen(0.15);
		assertEquals(1311,p1.precioProyecto(),0.05);	
	}
	
	@Test
	public void testPrecio() {
		assertEquals(1219.8, p1.precioProyecto(),0.05);
		p1.aprobarEtapa();
		assertEquals(1219.8, p1.precioProyecto(),0.05);
		p1.aprobarEtapa();
		assertEquals(1219.8, p1.precioProyecto(),0.05);
	}
	
	@Test
	public void testCosto() {
		assertEquals(1140, p1.costoProyecto(),0.05);
		p1.aprobarEtapa();
		assertEquals(1140, p1.costoProyecto(),0.05);
		p1.aprobarEtapa();
		assertEquals(1140, p1.costoProyecto(),0.05);
	}
	
	@Test
	public void testCancelar() {
		assertFalse(p1.getObjetivo().contains("(Cancelado)"));
		p1.cancelar();
		assertTrue(p1.getObjetivo().contains("(Cancelado)"));
		p1.cancelar();
		assertTrue(p1.getObjetivo().contains("(Cancelado)"));
	}

	
}
