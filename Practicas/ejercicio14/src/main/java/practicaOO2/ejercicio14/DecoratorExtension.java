package practicaOO2.ejercicio14;

public class DecoratorExtension extends DecoratorPrint{

	public DecoratorExtension(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String pretyPrint() {
		return super.pretyPrint() + "-" + super.getExtension();
	}

}
