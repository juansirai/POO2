package practicaOO2.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testMamiferos {
	private Mamifero hijoUno;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abuelaMaterna;
	private Mamifero abuelaPaterna;
	private Mamifero abueloMaterno;
	private Mamifero abueloPaterno;
	private Mamifero bisabueloUno;
	private Mamifero bisabueloDos;
	private Mamifero bisabueloTres;
	private Mamifero bisabueloCuatro;
	private Mamifero bisabuelaUno;
	private Mamifero bisabuelaDos;
	private Mamifero bisabuelaTres;
	private Mamifero bisabuelaCuatro;
	private Mamifero mamiferoNull;
	
	@BeforeEach
	void setUp() throws Exception{
		hijoUno = new MamiferoReal("1","Sapiens",LocalDate.now());
		padre = new MamiferoReal("2","Sapiens Sapiens",LocalDate.now());
		madre = new MamiferoReal("3","Sapiens Sapiens",LocalDate.now());
		abuelaMaterna = new MamiferoReal("4","Erectus",LocalDate.now());
		abuelaPaterna = new MamiferoReal("5","Erectus",LocalDate.now());
		abueloMaterno = new MamiferoReal("6","Erectus",LocalDate.now());
		abueloPaterno = new MamiferoReal("7","Erectus",LocalDate.now());
		bisabueloUno = new MamiferoReal("8","Neanderthal",LocalDate.now());
		bisabueloDos = new MamiferoReal("9","Neanderthal",LocalDate.now());
		bisabueloTres = new MamiferoReal("10","Neanderthal",LocalDate.now());
		bisabueloCuatro = new MamiferoReal("11","Neanderthal",LocalDate.now());
		bisabuelaUno = new MamiferoReal("12","Neanderthal",LocalDate.now());
		bisabuelaDos = new MamiferoReal("13","Neanderthal",LocalDate.now());
		bisabuelaTres = new MamiferoReal("14","Neanderthal",LocalDate.now());
		bisabuelaCuatro = new MamiferoReal("15","Neanderthal",LocalDate.now());
		mamiferoNull = new MamiferoNull();
		
		hijoUno.setPadre(padre);
		hijoUno.setMadre(madre);
		
		padre.setPadre(abueloPaterno);
		padre.setMadre(abuelaPaterna);
		madre.setPadre(abueloMaterno);
		madre.setMadre(abuelaMaterna);
		
		abueloPaterno.setPadre(bisabueloUno);
		abueloPaterno.setMadre(bisabuelaUno);
		abueloMaterno.setPadre(bisabueloDos);
		abueloMaterno.setMadre(bisabuelaDos);
		
		abuelaPaterna.setPadre(bisabueloTres);
		abuelaPaterna.setMadre(bisabuelaTres);
		abuelaMaterna.setPadre(bisabueloCuatro);
		abuelaMaterna.setMadre(bisabuelaCuatro);
		
		bisabueloUno.setPadre(mamiferoNull);
		bisabueloDos.setPadre(mamiferoNull);
		bisabueloTres.setPadre(mamiferoNull);
		bisabueloCuatro.setPadre(mamiferoNull);
		bisabuelaUno.setPadre(mamiferoNull);
		bisabuelaDos.setPadre(mamiferoNull);
		bisabuelaTres.setPadre(mamiferoNull);
		bisabuelaCuatro.setPadre(mamiferoNull);
		
		bisabueloUno.setMadre(mamiferoNull);
		bisabueloDos.setMadre(mamiferoNull);
		bisabueloTres.setMadre(mamiferoNull);
		bisabueloCuatro.setMadre(mamiferoNull);
		bisabuelaUno.setMadre(mamiferoNull);
		bisabuelaDos.setMadre(mamiferoNull);
		bisabuelaTres.setMadre(mamiferoNull);
		bisabuelaCuatro.setMadre(mamiferoNull);
		
	}
	
	@Test
	public void testTieneAncestro() {
		assertTrue(this.hijoUno.tieneComoAncestroA(bisabuelaDos));
		assertTrue(this.hijoUno.tieneComoAncestroA(madre));
		assertTrue(this.hijoUno.tieneComoAncestroA(abuelaPaterna));
		assertTrue(this.hijoUno.tieneComoAncestroA(abueloMaterno));
		
		assertFalse(this.hijoUno.tieneComoAncestroA(new MamiferoReal("sd","nuevo",LocalDate.now())));
	}
}