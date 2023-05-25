package practicaOO2.refactoring_ejercicio03;

public class LlamadaInternacional extends Llamada{
	private static final double CARGO_VARIABLE = 0.21;
	private static final int CARGO_FIJO = 200;
	
	public LlamadaInternacional(String emisor, String receptor, int dur) {
		super(emisor, receptor, dur);
	}
	@Override
	public double calcularCostoLlamada() {
		return getDur() *CARGO_FIJO + (getDur()*CARGO_FIJO*CARGO_VARIABLE);
	}

}
