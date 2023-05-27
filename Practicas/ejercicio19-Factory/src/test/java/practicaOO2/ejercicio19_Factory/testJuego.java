package practicaOO2.ejercicio19_Factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testJuego {
	private Juego juego;
	private Personaje guerrero;
	private Personaje arquero;
	private Personaje mago;
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.juego = new Juego();
		this.guerrero = this.juego.crearGuerrero("Pepe");
		this.arquero = this.juego.crearArquero("Roberta");
		this.mago = this.juego.crearMago("Harry");
	}
	
	@Test
	public void testGuerreroDefensa() {
		Personaje guerreroDos = this.juego.crearGuerrero("Ron");
		assertEquals(100, guerrero.getVida());
		this.juego.combatir(arquero, guerrero);
		assertEquals(98, guerrero.getVida());
		this.juego.combatir(mago, guerrero);
		assertEquals(97, guerrero.getVida());
		this.juego.combatir(guerreroDos, guerrero);
		assertEquals(94, guerrero.getVida());
	}
	
	@Test
	public void testArqueroDefensa() {
		Personaje arqueroDos = this.juego.crearArquero("Ron");
		assertEquals(100, arquero.getVida());
		this.juego.combatir(arqueroDos, arquero);
		assertEquals(95, arquero.getVida());
		this.juego.combatir(mago, arquero);
		assertEquals(93, arquero.getVida());
		this.juego.combatir(guerrero, arquero);
		assertEquals(85, arquero.getVida());
	}
	
	@Test
	public void testMagoDefensa() {
		Personaje magoDos = this.juego.crearMago("Ron");
		assertEquals(100, arquero.getVida());
		this.juego.combatir(magoDos, mago);
		assertEquals(98, mago.getVida());
		this.juego.combatir(guerrero, mago);
		assertEquals(90, mago.getVida());
		this.juego.combatir(arquero, mago);
		assertEquals(85, mago.getVida());
	}
}
