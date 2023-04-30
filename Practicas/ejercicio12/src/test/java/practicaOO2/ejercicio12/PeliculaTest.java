package practicaOO2.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PeliculaTest {
	private Pelicula p1, p2, p3, p4;

	@BeforeEach
	void setUp() throws Exception{
		p1 = new Pelicula("La Era del Hielo",2018,3);
		p2 = new Pelicula("Rapido y furioso",2020,9);
		p3 = new Pelicula("Mi pobre angelito",2021,7);
		p4 = new Pelicula("La Era del Hielo 2", 2023,6);
	}
	
	@Test
	public void testSimilares() {
		
		p1.establecerSimilitud(p2); //debería en p2 establecerse la similitud con P1
		p2.establecerSimilitud(p3);
		
		List<Pelicula> similaresp1 = new ArrayList<Pelicula>();
		List<Pelicula> similaresp2 = new ArrayList<Pelicula>();
		List<Pelicula> similaresp4 = new ArrayList<Pelicula>();
		similaresp1.add(p2);
		similaresp2.add(p1);
		similaresp2.add(p3);
		
		assertEquals(similaresp1, p1.getSimilares());
		assertEquals(similaresp2, p2.getSimilares());
		assertEquals(similaresp4, p4.getSimilares());
		
		
	}
}
