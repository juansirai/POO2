package practicaOO2.ejercicio14;

public class DecoratorNombre extends DecoratorPrint{

	
	public DecoratorNombre(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String pretyPrint() {
		return super.pretyPrint() +"-"+ super.getNombre();
	}

}
