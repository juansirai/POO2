package practicaOO2.refactoring_ejercicio03;

public class PersonaFisica extends Persoona{
	private static final double descuentoFis = 0;
	private String doc;
	
	public PersonaFisica(String nombreApellido, String tel, String dni) {
		super(nombreApellido, tel);
		this.doc = dni;
	}

	@Override
	public double descuento() {
		return descuentoFis;
	}


	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}


}
