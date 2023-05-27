package practicaOO2.ejercicio19_Factory;

public class Arco implements Arma{
	private static final String TIPO = "ARCO";
	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return TIPO;
	}

}
