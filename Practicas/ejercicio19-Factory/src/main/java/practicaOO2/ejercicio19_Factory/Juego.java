package practicaOO2.ejercicio19_Factory;

public class Juego {
	private Creator creator;
	
	public Personaje crearGuerrero(String nombre) {
		this.creator = new CreatorGuerrero();
		return this.creator.crearPersonaje(nombre);
	}
	
	public Personaje crearMago(String nombre) {
		this.creator = new CreatorMago();
		return this.creator.crearPersonaje(nombre);
	}
	
	public Personaje crearArquero(String nombre) {
		this.creator = new CreatorArquero();
		return this.creator.crearPersonaje(nombre);
	}
	
	public boolean combatir(Personaje atacante, Personaje atacado) {
		boolean exito = this.sePuedePelear(atacante,atacado);
		if(exito)
			atacado.defender(atacante.atacar());
		return exito;
	}
	
	private boolean sePuedePelear(Personaje atacante, Personaje atacado) {
		return atacante.vive() && atacado.vive();
	}
}
