package practicaOO2.ejercicio08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ExcursionTest {
	private Excursion provisoria, definitiva, llena;
	private Usuario u1, u2,u3, u4, u5;
	
	@BeforeEach
	void setUp() throws Exception{
		this.provisoria = new Excursion("Islas Victoria",LocalDate.of(2022,12, 3), "Bariloche", 100, 3, 5);
		this.definitiva = new Excursion("Bosques Arrayanes",LocalDate.of(2022,12, 3), "Bariloche", 100, 2, 5);
		this.llena = new Excursion("Dos dias en kayak bajando el Parana",LocalDate.of(2022,12, 3), "Bariloche", 100, 1, 2);
		
		this.u1 = new Usuario("Pepe","Argento","pepe@gmail.com");
		this.u2 = new Usuario("Moni","Argento","moni@gmail.com");
		this.u3 = new Usuario("Paola","Argento","paola@gmail.com");
		this.u4 = new Usuario("Coqui","Argento","coqui@gmail.com");
		this.u5 = new Usuario("John","Doe","JD@gmail.com");
		
		definitiva.inscribir(u1);
		definitiva.inscribir(u2);
		
		llena.inscribir(u3);
		llena.inscribir(u4);
	}
	
	@Test
	void testAgregar() {
		this.provisoria.inscribir(u1);

		assertEquals(2,this.provisoria.difMin());
		assertEquals(4, this.provisoria.difMax());
		assertEquals(1, this.provisoria.cantInscriptos());
		this.provisoria.inscribir(u2);

		this.provisoria.inscribir(u3);

		assertTrue(this.provisoria.getEstado() instanceof Definitiva);
		
		this.definitiva.inscribir(u3);
		this.definitiva.inscribir(u4);
		this.definitiva.inscribir(u5);
		assertEquals(0,this.definitiva.difMax());
		assertTrue(this.definitiva.getEstado() instanceof Llena);
		
		this.llena.inscribir(u1);
		assertEquals(2,this.llena.cantInscriptos());
		assertEquals(1, this.llena.cantEspera());
	}
	
	@Test
	void testInformar() {
		
		String esperadoProv = "Nombre: Islas Victoria\nCosto: 100.0\nFecha:2022-12-03\nPunto encuentro: Bariloche\nFaltantes para minimo: 3";
		String esperadoDef = "Nombre: Bosques Arrayanes\nCosto: 100.0\nFecha:2022-12-03\nPunto encuentro: Bariloche\nMails: pepe@gmail.com, moni@gmail.com\nFaltantes para maximo: 3";
		String esperadoLlena = "Nombre: Dos dias en kayak bajando el Parana\nCosto: 100.0\nFecha:2022-12-03\nPunto encuentro: Bariloche";
		assertEquals(esperadoProv, this.provisoria.infoExcursion());
		assertEquals(esperadoDef, this.definitiva.infoExcursion());
		assertEquals(esperadoLlena, this.llena.infoExcursion());
		
	}
}
