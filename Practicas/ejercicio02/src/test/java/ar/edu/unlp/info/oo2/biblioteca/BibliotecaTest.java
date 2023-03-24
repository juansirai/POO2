package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca biblioteca;
	private Socio s1, s2, s3;
	
	@BeforeEach
	void setUp() throws Exception{
		biblioteca = new Biblioteca();
		s1 = new Socio("Juan", "juanbsirai664@gmail.com", "123");
		s2 = new Socio("Cosme", "cosmefulanito@gmail.com", "345");
		s3 = new Socio("Rafa", "rafaelo@yahoo.com","678");
		biblioteca.agregarSocio(s1);
		biblioteca.agregarSocio(s2);
		biblioteca.agregarSocio(s3);
	}
	
	@Test
	public void testExporter() {
		assertTrue(biblioteca.exportarSocios().contains("Juan"));
		assertTrue(biblioteca.exportarSocios().contains("juanbsirai664@gmail.com"));
		assertTrue(biblioteca.exportarSocios().contains("123"));
		assertTrue(biblioteca.exportarSocios().contains("Cosme"));
		assertTrue(biblioteca.exportarSocios().contains("cosmefulanito@gmail.com"));
		assertTrue(biblioteca.exportarSocios().contains("345"));
		assertTrue(biblioteca.exportarSocios().contains("Rafa"));
		assertTrue(biblioteca.exportarSocios().contains("rafaelo@yahoo.com"));
		assertTrue(biblioteca.exportarSocios().contains("678"));
	}
}
