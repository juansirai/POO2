package practicaOO2.ejercicio19_Factory;

import java.util.Hashtable;

public class Acero extends Armadura{
	private static final String TIPO = "ACERO";
	
	@Override
	public int defender(String arma) {
		Hashtable<String, Integer> puntajes = this.getTablaPuntajes(TIPO);
		return puntajes.get(arma);
	}

}
