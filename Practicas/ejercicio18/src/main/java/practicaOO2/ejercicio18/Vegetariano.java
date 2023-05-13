package practicaOO2.ejercicio18;

public class Vegetariano {

	private double pan;
	private double principal;
	private double adicional;
	
	public Vegetariano(double pan,double principal,double adicional) {
		this.pan = pan;
		this.principal = principal;
		this.adicional = adicional;
	}
	
	public Vegetariano() {};
	
	public void addPan(double pan) {
		this.pan = pan;
	}
	

	public void addPrincipal(double p) {
		this.principal = p;
	}
	
	public double getCosto() {
		return this.pan +  this.principal + this.adicional;
	}

}
