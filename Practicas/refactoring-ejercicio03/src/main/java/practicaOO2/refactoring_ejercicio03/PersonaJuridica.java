package practicaOO2.refactoring_ejercicio03;

public class PersonaJuridica extends Persoona{
	private static final double descuentoJur = 0.15;
	private String cuit;
	
	
	public PersonaJuridica(String nombreApellido, String tel, String cuit) {
		super(nombreApellido, tel);
		this.cuit = cuit;
	}
	
	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return descuentoJur;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


}
