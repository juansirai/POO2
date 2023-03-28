package practicaOO2.ejercicio05;

import java.time.LocalDate;

public class Archivo extends FileSystem{
	
	public Archivo(String nombre, LocalDate fecha, int tamanio) {
		super(nombre, fecha);
		this.tamanio = tamanio;
	}

	@Override
	public int tamanioTotalOcupado() {
		// TODO Auto-generated method stub
		return super.getTamanio();
	}

	@Override
	public Archivo archivoMasGrande() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return this;
	}
	
	
}
