package practicaOO2.refactoring_ejercicio03;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>(); 
	private String nombreApellido;
	private String tel;

	
	public Persoona(String nombreApellido, String tel) {
		this.nombreApellido = nombreApellido;
		this.tel = tel;
	}
	
	public List<Llamada> getLlamadasRealizadas() {
		return llamadas;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nya) {
		this.nombreApellido = nya;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	public double calcularMontoLlamadas() {
		return this.getLlamadasRealizadas().stream()
				   .mapToDouble(llamada -> llamada.calcularCostoLlamada() * (1-descuento()))
				   .sum();
	}
	
	protected abstract double descuento();
	
	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}

	
}

