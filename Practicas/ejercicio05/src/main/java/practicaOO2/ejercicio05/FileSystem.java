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
	

	/*
	Retorna el espacio total ocupado, incluyendo su contenido.
	*/
	public abstract int tamanioTotalOcupado();
	
	
	/*
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	* filesystem contenido por directorio receptor
	*/
	public abstract Archivo archivoMasGrande();
	
	/*
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel
	* del filesystem contenido por directorio receptor.
	*/
	public abstract Archivo archivoMasNuevo();
}
