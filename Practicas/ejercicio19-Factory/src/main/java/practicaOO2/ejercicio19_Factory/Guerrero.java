package practicaOO2.ejercicio19_Factory;

public class Guerrero extends Personaje{

	
	public Guerrero(String nombre) {
		super(nombre);
		this.agregarHabilidad(new CombateCuerpo());
		this.setArmadura(new Acero());
		this.setArma(new Espada());
	}



}
