package practicaOO2.ejercicio06;

public class Temporario extends Empleado{
	private int horasTrabajadas;
	private boolean casado;
	private int cantHijos;

	public Temporario() {
		super.setBase(20000);
		this.horasTrabajadas = 0;
		this.casado = false;
		this.cantHijos = 0;
	}
	
	public Temporario(boolean casado, int hijos) {
		super.setBase(20000);
		this.horasTrabajadas = 0;
		this.casado = casado;
		this.cantHijos = hijos;
	}
	
	public Temporario(int horas, boolean casado, int hijos) {
		super.setBase(20000);
		this.horasTrabajadas = horas;
		this.casado = casado;
		this.cantHijos = hijos;
	}
	
	public void agregarHoras(int h) {
		this.horasTrabajadas+=h;
	}
	
	private int getHoras() {
		return this.horasTrabajadas;
	}
	
	
	public double calcularBasico() {
		return this.getHoras()*300 + super.calcularBasico();
	}

	@Override
	public double calcularAdicional() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
