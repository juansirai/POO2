package practicaOO2.ejercicio14;

import java.time.LocalDate;

public class DecoratorPrint implements FileOO2{
	private FileOO2 file;
	
	public DecoratorPrint(FileOO2 file) {
		this.file = file;
	};
	
	
	@Override
	public String pretyPrint() {
		return file.pretyPrint();
	}


	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return file.getNombre();
	}


	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return file.getExtension();
	}


	@Override
	public double getTamanio() {
		// TODO Auto-generated method stub
		return file.getTamanio();
	}


	@Override
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return file.getFechaModificacion();
	}


	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return file.getFechaCreacion();
	}


	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return file.getPermisos();
	};

}
