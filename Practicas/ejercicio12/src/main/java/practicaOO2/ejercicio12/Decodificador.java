package practicaOO2.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> grilla; // conviene tener un objeto aparte con la grilla, y que el deco conozca la misma? Ej Singleton
	private List<Pelicula> reproducidas;
	private Recomendador estrategia;
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		this.estrategia = new Novedad(); // inicializacion por defecto
		
	}
	
	public void setStrategy(Recomendador estrategia) {
		this.estrategia = estrategia;
	}
	
	
	public void agregarPeliGrilla(Pelicula p) {
		this.grilla.add(p);
	}
	public void reproducir(Pelicula p) {
		this.reproducidas.add(p);
	}
	
	public List<Pelicula> getGrilla(){
		return this.grilla;
	}
	
	public List<Pelicula> getReproducidas(){
		return this.reproducidas;
	}
	
	public List<Pelicula> getRecomendaciones(){
		return this.estrategia.recomendar(this);
	}
}
