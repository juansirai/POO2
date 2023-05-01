package practicaOO2.ejercicio14;

import java.time.LocalDate;

public interface FileOO2 {

	public abstract String pretyPrint();
	
	public abstract String getNombre();
	
	public abstract String getExtension();
	
	public abstract double getTamanio();
	
	public abstract LocalDate getFechaModificacion();
	
	public abstract LocalDate getFechaCreacion();
	
	public abstract String getPermisos();
}
