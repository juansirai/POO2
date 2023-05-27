package practicaOO2.ejercicio19_Factory;

import java.util.Hashtable;

public class Cuero extends Armadura{
	private static final String TIPO = "CUERO";

	@Override
	public int defender(String arma) {
		Hashtable<String, Integer> puntajes = this.getTablaPuntajes(TIPO);
		return puntajes.get(arma);
	}

}
