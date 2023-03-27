package practicaOO2.ejercicio05;

import java.time.LocalDate;

public abstract class FileSystem {
	private String nombre;
	private LocalDate fechaCreacion;
	protected int tamanio;
	
	public FileSystem(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFecha() {
		return this.fechaCreacion;
	}
	
	public int getTamanio() {
		return this.tamanio;
	}
	

	
	public abstract int tamanioTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
}
