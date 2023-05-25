package practicaOO2.refactoring_ejercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {
	
	Persoonal sistema;
	Persoona emisorPersonaFisca, remitentePersonaFisica, emisorPersonaJuridica, remitentePersonaJuridica;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		this.sistema.agregarTelefono("2214444554");
		this.sistema.agregarTelefono("2214444555");
		this.sistema.agregarTelefono("2214444556");
		this.sistema.agregarTelefono("2214444557");
		
		this.emisorPersonaFisca = sistema.registrarUsuarioFisico("11555666", "Marcelo Tinelli" );
		this.remitentePersonaFisica = sistema.registrarUsuarioFisico("00000001", "Mirtha Legrand" );
		this.emisorPersonaJuridica = sistema.registrarUsuarioJuridico("17555222", "Felfort" );
		this.remitentePersonaJuridica = sistema.registrarUsuarioJuridico("25765432", "Moovistar" );
		
		this.sistema.registrarLlamadaNacional(emisorPersonaJuridica, remitentePersonaFisica,  10);
		this.sistema.registrarLlamadaInternacional(emisorPersonaJuridica, remitentePersonaFisica,  8);
		this.sistema.registrarLlamadaNacional(emisorPersonaJuridica, remitentePersonaJuridica,  5);
		this.sistema.registrarLlamadaInternacional(emisorPersonaJuridica, remitentePersonaJuridica, 7);
		this.sistema.registrarLlamadaNacional(emisorPersonaFisca, remitentePersonaFisica,  15);
		this.sistema.registrarLlamadaInternacional(emisorPersonaFisca, remitentePersonaFisica,  45);
		this.sistema.registrarLlamadaNacional(emisorPersonaFisca, remitentePersonaJuridica,  13);
		this.sistema.registrarLlamadaInternacional(emisorPersonaFisca, remitentePersonaJuridica, 17);
		
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 15105.640000000001, 1);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 3131.7825000000003, 1);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica), 0, 1);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica), 0, 1);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.agregarTelefono("2214444558"); 
		Persoona nuevaPersona = this.sistema.registrarUsuarioFisico("2444555","Chiche Gelblung");
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisca));
		this.sistema.eliminarUsuario(emisorPersonaFisca);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisca));
	}

}

