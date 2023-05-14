package practicaOO2.ejercicio18;

public class BuilderSinTacc implements Builder{
	private SinTacc sinTacc;
	
	@Override
	public void reset() {
		this.sinTacc = new SinTacc();
	}

	@Override
	public void addPan() {
		this.sinTacc.addPan();
		
	}

	@Override
	public void addPrincipal() {
		this.sinTacc.addPrincipal();	
	}
	
	@Override
	public void addAdicional() {
		this.sinTacc.addAdicional();
	}
	
	@Override
	public void addAderezo() {
		this.sinTacc.addAderezo();
	}
	
	public SinTacc getResult() {
		return this.sinTacc;  
	}

}
