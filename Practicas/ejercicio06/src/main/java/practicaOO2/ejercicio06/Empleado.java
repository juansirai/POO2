package practicaOO2.ejercicio06;

public abstract class Empleado {
	protected double base;
	private double DESCUENTOBASICO = 0.13;
	private double DESCUENTOADICIONAL = 0.05;
	
	public Empleado() {
		this.base = 20000;
	};
	
	protected void setBase(double base) {
		this.base = base;
	}
	
	public double calcularBasico() {
		return this.base;
	}
	
	public abstract double calcularAdicional();
	
	public double calcularDescuento() {
		return this.DESCUENTOBASICO * this.calcularBasico() + this.DESCUENTOADICIONAL * this.calcularAdicional();
	}
	
	public double sueldo() {
		return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
	}

}
