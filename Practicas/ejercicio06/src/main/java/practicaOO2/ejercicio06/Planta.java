package practicaOO2.ejercicio06;

public class Planta extends Empleado{
	private boolean casado;
	private int cantHijos;
	private int antiguedad;
	private double adicHijos = 2000;
	private double adicCasado = 5000;
	private double adicAntiguedad = 2000;
	
	// TODO: consultar si el metodo calcular adicional debería ser compartido por temporario y planta
	
	
	public Planta() {
		this.base = 50000;
		this.casado = false;
		this.cantHijos = 0;
		this.antiguedad = 0;
	}
	
	
	public Planta(boolean c, int h, int a) {
		this.base = 50000;
		this.casado = c;
		this.cantHijos = h;
		this.antiguedad = a;
	}


	public void setHijos(int h) {
		this.cantHijos  = h;
	}
	public void setCasado(boolean c) {
		this.casado = c;
	}
	public void setAntiguedad(int a) {
		this.antiguedad = a;
	}
	
	@Override
	public double calcularAdicional() {
		double result = 0;
		if(this.casado)
			result+=this.adicCasado;
		return result + this.adicHijos * this.cantHijos + this.adicAntiguedad * this.antiguedad;
	}

}
