package practicaOO2.ejercicio18;

public class BuilderVegano implements Builder{
	private Vegano vegano;
	
	@Override
	public void reset() {
		this.vegano = new Vegano();
		
	}

	@Override
	public void addPan() {
		this.vegano.addPan();
		
	}

	@Override
	public void addPrincipal() {
		this.vegano.addPrincipal();
	}
	
	@Override
	public void addAderezo() {
		this.vegano.addAderezo();
	}
	
	
	public Vegano getResult() {
		return this.vegano;
	}

	@Override
	public void addAdicional() {
		// TODO Auto-generated method stub
		
	}

}
