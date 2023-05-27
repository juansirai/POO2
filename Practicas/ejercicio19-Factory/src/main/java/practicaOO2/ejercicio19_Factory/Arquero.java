package practicaOO2.ejercicio19_Factory;

public class Arquero extends Personaje {

	public Arquero(String nombre) {
		super(nombre);
		this.agregarHabilidad(new CombateDistancia());
		this.setArmadura(new Cuero());
		this.setArma(new Arco());
	}



}
