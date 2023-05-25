package practicaOO2.refactoring_ejercicio03;

public abstract class Llamada {
	private String emisor;
	private String remitente;
	private int dur;
	
	public Llamada() {
		
	}
	
	public Llamada(String emisor, String receptor, int dur) {
		this.emisor= emisor;
		this.remitente= receptor;
		this.setDur(dur);
	}


	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public int getDur() {
		return dur;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}
	
	abstract double calcularCostoLlamada();
		
	
}