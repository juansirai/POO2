package practicaOO2.ejercicio18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCliente {
	private Director director;
	private BuilderClasico builderClasico;
	private BuilderVegetariano builderVegetariano;
	private BuilderSinTacc builderSinTacc;
	private BuilderVegano builderVegano;
	
	@BeforeEach
	void SetUp() throws Exception{
		this.director = new Director();
		this.builderClasico = new BuilderClasico();
		this.builderVegano = new BuilderVegano();
		this.builderVegetariano = new BuilderVegetariano();
		this.builderSinTacc = new BuilderSinTacc();
	}
	
	
	@Test
	public void testVegano() {
		director.makeVegano(builderVegano);
		Vegano vegano = builderVegano.getResult();
		assertEquals(620, vegano.getCosto());
	}
	
	public void testVegetariano() {
		director.makeVegano(builderVegetariano);
		Vegetariano vegetariano = builderVegetariano.getResult();
		assertEquals(420, vegetariano.getCosto());
	}
	
	public void testClasico() {
		director.makeClasico(builderClasico);
		Clasico c = builderClasico.getResult();
		assertEquals(500, c.getCosto());
	}
	
	public void testSinTacc() {
		director.makeSinTacc(builderSinTacc);
		SinTacc st = builderSinTacc.getResult();
		assertEquals(618, st.getCosto());
	}
}
