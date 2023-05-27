package practicaOO2.ejercicio19_Factory;

import java.util.Hashtable;

public class TablaPuntajes {
	private static TablaPuntajes instance;
	private Hashtable<String, Hashtable<String, Integer>> master = new Hashtable<String, Hashtable<String, Integer>>();
	
	private TablaPuntajes() {
		Hashtable<String, Integer> hierro = setearPuntosHierro();
		Hashtable<String, Integer> acero = setearPuntosAcero();
		Hashtable<String, Integer> cuero = setearPuntosCuero();
		
		this.master.put("HIERRO", hierro);
		this.master.put("CUERO", cuero);
		this.master.put("ACERO", acero);
	};
	
	private Hashtable<String, Integer> setearPuntosHierro() {
		Hashtable<String, Integer> hierro = new Hashtable<String, Integer>();
		hierro.put("ESPADA", 5);
		hierro.put("ARCO", 3);
		hierro.put("BASTON", 1);
		return hierro;
	}
	
	
	private Hashtable<String, Integer> setearPuntosCuero() {
		Hashtable<String, Integer> cuero = new Hashtable<String, Integer>();
		cuero.put("ESPADA", 8);
		cuero.put("ARCO", 5);
		cuero.put("BASTON", 2);
		return cuero;
	}	
	
	
	private Hashtable<String, Integer> setearPuntosAcero() {
		Hashtable<String, Integer> acero = new Hashtable<String, Integer>();
		acero.put("ESPADA", 3);
		acero.put("ARCO", 2);
		acero.put("BASTON", 1);
		return acero;
	}
	
	
	static TablaPuntajes getInstance() {
		if(instance == null) {
			instance = new TablaPuntajes();
		}
		return instance;
	}
	
	public Hashtable<String, Integer> get(String armadura){
		return this.master.get(armadura);
	}

}
