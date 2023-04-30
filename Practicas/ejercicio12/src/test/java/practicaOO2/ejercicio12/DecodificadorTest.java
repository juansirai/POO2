package practicaOO2.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	private Decodificador deco;
	private Pelicula p1, p2, p3, p4, p5, p6;
	
	@BeforeEach
	void setUp() throws Exception {
		this.deco = new Decodificador();
		this.p1 = new Pelicula("Thor", 2017,7.9);
		this.p2 = new Pelicula("Capitan America",2016,7.8);
		this.p3 = new Pelicula("Iron Man", 2010, 7.9);
		this.p4 = new Pelicula("Dunkirk", 2017, 7.9);
		this.p5 = new Pelicula("Rocky", 1976, 8.1);
		this.p6 = new Pelicula("Rambo", 1979, 7.8);
		
		// establecemos similitudes
		this.p1.establecerSimilitud(p2);
		this.p1.establecerSimilitud(p3);
		this.p2.establecerSimilitud(p3);
		
		this.p5.establecerSimilitud(p6);
		
		//agregamos a la grilla
		this.deco.agregarPeliGrilla(p1);
		this.deco.agregarPeliGrilla(p2);
		this.deco.agregarPeliGrilla(p3);
		this.deco.agregarPeliGrilla(p4);
		this.deco.agregarPeliGrilla(p5);
		this.deco.agregarPeliGrilla(p6);
		
		//reproducimos
		this.deco.reproducir(p1);
		this.deco.reproducir(p5);
		
	}
	
	@Test
	public void testSimilaridad() {
		Similaridad similaridad = new Similaridad();
		this.deco.setStrategy(similaridad);
		List<Pelicula> porSimilaridad = new ArrayList<Pelicula>();
		porSimilaridad.add(p2);
		porSimilaridad.add(p3);
		porSimilaridad.add(p6);
		
		assertEquals(porSimilaridad, this.deco.getRecomendaciones());
		
	}
	
	@Test
	public void testPuntaje() {
		Puntaje puntaje = new Puntaje();
		this.deco.setStrategy(puntaje);
		List<Pelicula> porPuntaje = new ArrayList<Pelicula>();
		porPuntaje.add(p4);
		porPuntaje.add(p3);
		porPuntaje.add(p2);
		
		assertEquals(porPuntaje, this.deco.getRecomendaciones());
	}

}
