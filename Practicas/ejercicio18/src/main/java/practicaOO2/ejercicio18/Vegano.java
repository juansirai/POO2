package practicaOO2.ejercicio18;

public class Vegano {
	private double costo;
	private final double pan = 100;
	private final double principal = 500;
	private final double aderezo = 20;
	
	public Vegano() {
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
	
	
	public double getCosto() {
		return this.costo;
	}
}
