package practicaOO2.ejercicio14;

public class DecoratorPermisos extends DecoratorPrint{

	public DecoratorPermisos(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String pretyPrint() {
		return super.pretyPrint() + "-" + super.getPermisos();
	}
	
}
