package practicaOO2.ejercicio18;

public class SinTacc {
	private double costo;
	private final double pan = 150;
	private final double aderezo = 18;
	private final double principal = 250;
	private final double adicional = 200;
	
	public SinTacc() {
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
