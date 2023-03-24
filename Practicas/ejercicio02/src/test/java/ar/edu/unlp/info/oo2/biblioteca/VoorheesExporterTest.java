package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VoorheesExporterTest {
	VoorheesExporter exporter;
	Socio s1, s2, s3;
	List<Socio> socios;
	
	@BeforeEach
	void setUp() throws Exception{
		exporter = new VoorheesExporter();
		s1 = new Socio("Juan", "juanbsirai664@gmail.com", "123");
		s2 = new Socio("Cosme", "cosmefulanito@gmail.com", "345");
		s3 = new Socio("Rafa", "rafaelo@yahoo.com","678");
		socios = new ArrayList<Socio>();
		socios.add(s1);
		socios.add(s2);
		socios.add(s3);
	}
	
	@Test
	public void testExporter() {
		assertTrue(exporter.exportar(socios).contains("Juan"));
		assertTrue(exporter.exportar(socios).contains("juanbsirai664@gmail.com"));
		assertTrue(exporter.exportar(socios).contains("123"));
		assertTrue(exporter.exportar(socios).contains("Cosme"));
		assertTrue(exporter.exportar(socios).contains("cosmefulanito@gmail.com"));
		assertTrue(exporter.exportar(socios).contains("345"));
		assertTrue(exporter.exportar(socios).contains("Rafa"));
		assertTrue(exporter.exportar(socios).contains("rafaelo@yahoo.com"));
		assertTrue(exporter.exportar(socios).contains("678"));
	}
}
