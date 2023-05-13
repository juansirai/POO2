package practicaOO2.ejercicio18;

public class Vegano {
	private double pan;
	private double aderezo;
	private double principal;
	
	public Vegano(double pan,double aderezo,double principal) {
		this.pan = pan;
		this.aderezo = aderezo;
		this.principal = principal;
	}
	
	public Vegano() {};
	
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
		return this.pan + this.aderezo + this.principal;
	}
}
