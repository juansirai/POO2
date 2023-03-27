package practicaOO2.ejercicio05;

import java.time.LocalDate;

public class Directorio extends FileSystem{

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		this.tamanio = 32;
	}

	@Override
	public int tamanioTotalOcupado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Archivo archivoMasGrande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return null;
	}
}
