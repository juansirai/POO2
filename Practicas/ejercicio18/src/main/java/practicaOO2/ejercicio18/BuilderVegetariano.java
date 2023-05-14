package practicaOO2.ejercicio18;

public class BuilderVegetariano implements Builder{
	private Vegetariano vegetariano;
	
	@Override
	public void reset() {
		this.vegetariano = new Vegetariano();
		
	}

	@Override
	public void addPan() {
		this.vegetariano.addPan();
		
	}

	@Override
	public void addPrincipal() {
		this.vegetariano.addPrincipal();
	}
	
	@Override
	public void addAdicional() {
		this.vegetariano.addAdicional();
	}
	
	public Vegetariano getResult() {
		return this.vegetariano;
	}

	@Override
	public void addAderezo() {
		// TODO Auto-generated method stub
		
	}

}
