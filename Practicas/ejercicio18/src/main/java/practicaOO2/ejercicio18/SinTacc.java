package practicaOO2.ejercicio18;

public class SinTacc {
	private double pan;
	private double aderezo;
	private double principal;
	private double adicional;
	
	public SinTacc(double pan,double aderezo,double principal,double adicional) {
		this.pan = pan;
		this.aderezo = aderezo;
		this.principal = principal;
		this.adicional = adicional;
		
	}
	
	public SinTacc() {};
	
	public void addPan(double pan) {
		this.pan = pan;
	}
	
	public void addAderezo(double a) {
		this.aderezo = a;
	}
	
	public void addPrincipal(double p) {
		this.principal = p;
	}
	
	public void addAdicional(double p) {
		this.adicional = p;
	}
	
	public double getCosto() {
		return this.pan + this.aderezo + this.principal + this.adicional;
	}
}
