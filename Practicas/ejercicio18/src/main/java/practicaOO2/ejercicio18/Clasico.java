package practicaOO2.ejercicio18;

public class Clasico {
	private double costo;
	private final double pan = 100;
	private final double aderezo = 20;
	private final double principal = 300;
	private final double adicional = 80;
	
	public Clasico() {
		this.costo = 0;
	}
	
	public void addPan() {
		this.costo += pan;
	}
	
	public void addAderezo() {
		this.costo += aderezo;
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
