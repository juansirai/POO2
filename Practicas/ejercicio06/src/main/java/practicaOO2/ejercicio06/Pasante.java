package practicaOO2.ejercicio06;

public class Pasante extends Empleado{
	private int examenes;
	private double adicionalE = 2000;
	
	public Pasante() {
		super(); // es realmente necesario?
		this.examenes = 0;
	};
	
	public Pasante(int examenes) {
		this.examenes = examenes;
	}
	
	public void setExamen(int e) {
		this.examenes = e;
	}
	public int getExamenes() {
		return this.examenes;
	}
	
	@Override
	public double calcularAdicional() {
		return this.getExamenes() * this.adicionalE;
	}
}
