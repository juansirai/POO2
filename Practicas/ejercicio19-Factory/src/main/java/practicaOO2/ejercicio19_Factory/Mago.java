package practicaOO2.ejercicio19_Factory;

public class Mago extends Personaje {

	public Mago(String nombre) {
		super(nombre);
		this.agregarHabilidad(new Magia());
		this.agregarHabilidad(new Curacion());
		this.setArmadura(new Cuero());
		this.setArma(new Baston());
	}


}
