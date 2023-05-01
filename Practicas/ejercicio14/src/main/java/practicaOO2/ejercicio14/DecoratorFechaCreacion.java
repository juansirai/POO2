package practicaOO2.ejercicio14;

public class DecoratorFechaCreacion extends DecoratorPrint{

	public DecoratorFechaCreacion(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String pretyPrint() {
		return super.pretyPrint() + "-" + super.getFechaCreacion();
	}

}
