package practicaOO2.ejercicio18;

public class Clasico {
	
	private double pan;
	private double aderezo;
	private double principal;
	private double adicional;
	
	public Clasico(double pan,double aderezo,double principal,double adicional) {
		this.pan = pan;
		this.aderezo = aderezo;
		this.principal = principal;
		this.adicional = adicional;

	}
	
	public Clasico() {};
	
	public void addPan(double pan) {
		this.pan = pan;
	}
	
	public void addAderezo(double a) {
		this.aderezo = a;
	}
	
	public void addPrincipal(double p) {
		this.principal = p;
	}
	
	public double getCosto() {
		return this.pan + this.aderezo + this.principal + this.adicional;
	}
}
