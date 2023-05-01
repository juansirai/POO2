package practicaOO2.ejercicio14;

public class DecoratorSize extends DecoratorPrint{

	public DecoratorSize(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String pretyPrint() {
		return super.pretyPrint() + "-" + super.getTamanio();
	}

}
