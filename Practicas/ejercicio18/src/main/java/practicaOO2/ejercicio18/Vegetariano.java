package practicaOO2.ejercicio18;

public class Vegetariano {
	private double costo;
	private final double pan = 120;
	private final double principal = 200;
	private final double adicional = 100;
	
	public Vegetariano() {
		this.costo = 0;
	}
	
	public void addPan() {
		this.costo += pan;
	}
	
	public void addPrincipal() {
		this.costo += principal;
	}
	
	public void addAdicional() {
		this.costo += adicional;
	}
	
	public double getCosto() {
		return this.costo;
	}

}
