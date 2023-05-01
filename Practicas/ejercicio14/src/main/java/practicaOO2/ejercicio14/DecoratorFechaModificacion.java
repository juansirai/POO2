package practicaOO2.ejercicio14;

public class DecoratorFechaModificacion extends DecoratorPrint{

	public DecoratorFechaModificacion(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String pretyPrint() {
		return super.pretyPrint() + "-" + super.getFechaModificacion();
	}

}
