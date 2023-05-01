package practicaOO2.ejercicio14;

import java.time.LocalDate;

public class File implements FileOO2{

	private String nombre;
	private String extension;
	private double tamanio;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public File(String nombre, String extension, double tamanio,
			LocalDate fechaCreacion, LocalDate fechaModificacion, String permisos) {
		
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}
	
	// algunos getters 

	
	@Override
	public String getNombre() {
		return this.nombre;
	}
	
	
	@Override
	public String pretyPrint() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.extension;
	}

	@Override
	public double getTamanio() {
		// TODO Auto-generated method stub
		return this.tamanio;
	}

	@Override
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return this.fechaModificacion;
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.permisos;
	}
	
}
