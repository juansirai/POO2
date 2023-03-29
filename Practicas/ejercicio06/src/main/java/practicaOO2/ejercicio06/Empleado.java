package practicaOO2.ejercicio06;

public abstract class Empleado {
	private double base;
	
	public Empleado() {
		this.base = 0;
	};
	
	protected void setBase(double base) {
		this.base = base;
	}
	
	public double calcularBasico() {
		return this.base;
	}
	
	public abstract double calcularAdicional();
	
	public double calcularDescuento() {
		return 0.13 * this.calcularBasico() + 0.05 * this.calcularAdicional();
	}
	
	public double sueldo() {
		return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
	}

}
