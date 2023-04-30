package practicaOO2.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> peliculasSimilares;
	
	public Pelicula(String titulo, int anioEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<Pelicula>();
	}
	
	public void establecerSimilitud(Pelicula p) {
		if(!this.peliculasSimilares.contains(p)) {
			this.peliculasSimilares.add(p);
			p.establecerSimilitud(this);  // se agregan en ambas peliculas, relacion reciproca
		}
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAnioEstreno(int a) {
		this.anioEstreno = a;
	}
	public int getAnioEstreno() {
		return this.anioEstreno;
	}
	
	public void setPuntaje(float punt) {
		this.puntaje = punt;
	}
	public double getPuntaje() {
		return this.puntaje;
	}
	
	public List<Pelicula> getSimilares(){
		return this.peliculasSimilares;
	}
	


}
