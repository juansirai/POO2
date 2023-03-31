package practicaOO2.ejercicio06;

public class Temporario extends Empleado{
	private int horasTrabajadas;
	private boolean casado;
	private int cantHijos;
	private double ADICIONALHIJOS = 2000;
	private double ADICIONALCASADO = 5000;
	private double ADICIONALHORAS = 300;

	public Temporario() {
		super();
		this.horasTrabajadas = 0;
		this.casado = false;
		this.cantHijos = 0;
	}
	
	public Temporario(boolean casado, int hijos) {
		super();
		this.horasTrabajadas = 0;
		this.casado = casado;
		this.cantHijos = hijos;
	}
	
	public Temporario(int horas, boolean casado, int hijos) {
		super();
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
		return this.getHoras() * this.ADICIONALHORAS + super.calcularBasico();
	}

	@Override
	public double calcularAdicional() {
		if(this.casado)
			return this.ADICIONALCASADO + this.ADICIONALHIJOS * this.cantHijos;
		else
			return this.ADICIONALHIJOS * this.cantHijos;
	}

	
	

}
