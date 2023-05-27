package practicaOO2.ejercicio19_Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
	private int vida;
	private String nombre;
	private Armadura armadura;
	private Arma arma;
	private List<Habilidades> habilidades = new ArrayList<Habilidades>();
	
	public Personaje(String nombre) {
		this.vida = 100;
		this.nombre = nombre;
	}
	
	public String atacar() {
		return this.arma.atacar();
	};
	public void defender(String arma) {
		this.vida -= this.armadura.defender(arma);
	};
	
	protected void setArmadura(Armadura a) {
		this.armadura = a;
	}
	
	protected void setArma(Arma a) {
		this.arma = a;
	}
	
	protected void agregarHabilidad(Habilidades h) {
		this.habilidades.add(h);
	}
	
	public boolean vive() {
		return this.vida>0;
	}
	
	public int getVida() {
		return this.vida;
	}
}
