package practicaOO2.ejercicio18;

public class BuilderClasico implements Builder{
	private Clasico clasico;
	

	@Override
	public void reset() {
		this.clasico = new Clasico();
		
	}

	@Override
	public void addPan() {
		this.clasico.addPan();
	}

	@Override
	public void addPrincipal() {
		this.clasico.addPrincipal();
	}
	
	@Override
	public void addAderezo() {
		this.clasico.addAderezo();
	}
	
	@Override
	public void addAdicional() {
		this.clasico.addAdicional();
	}
	
	public Clasico getResult() {
		return this.clasico;
	}

}
