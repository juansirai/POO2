package practicaOO2.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDecorator {

	private FileOO2 archivo;
	
	@BeforeEach
	void SetUp() throws Exception{
		this.archivo = new File("OO2",".jav",128, LocalDate.of(2023, 12, 1),LocalDate.of(2023, 12, 3),"XRW");
	}
	
	@Test
	public void testNombrePermisos() {
		FileOO2 nombre = new DecoratorNombre(archivo);
		FileOO2 permisos = new DecoratorPermisos(nombre);
		assertEquals("-OO2-XRW", permisos.pretyPrint());
	}
	
	@Test
	public void testPermisosNombre() {
		FileOO2 permisos = new DecoratorPermisos(archivo);
		FileOO2 nombre = new DecoratorNombre(permisos);
		assertEquals("-XRW-OO2", nombre.pretyPrint());
		
	}
	
	@Test
	public void testExtensionNombrePermisos() {
		FileOO2 extension = new DecoratorExtension(archivo);
		FileOO2 nombre = new DecoratorNombre(extension);
		FileOO2 permisos = new DecoratorPermisos(nombre);
		
		assertEquals("-.jav-OO2-XRW", permisos.pretyPrint());
		
	}
	
}
