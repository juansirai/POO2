package practicaOO2.ejercicio19_Factory;

import java.util.Hashtable;

public abstract class Armadura {
	private TablaPuntajes tabla = TablaPuntajes.getInstance();
	public abstract int defender(String arma);

	/*retorna la tabla de daños especifico de la armadura*/
	protected Hashtable<String, Integer> getTablaPuntajes(String ARMADURA){
		return this.tabla.get(ARMADURA);
	}
}
