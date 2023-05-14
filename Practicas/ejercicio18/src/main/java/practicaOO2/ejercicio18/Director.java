package practicaOO2.ejercicio18;

public class Director {
	/*private Builder builder;*/ // TODO: es necesario?
	
	public Director() {};
	
	public void makeClasico(Builder b) {
		b.reset();;
		b.addPan();
		b.addPrincipal();
		b.addAdicional();
	};
	
	public void makeVegano(Builder b) {
		b.reset();
		b.addPan();
		b.addPrincipal();
		b.addAderezo();
	}
	
	public void makeVegetariano(Builder b) {
		b.reset();
		b.addPan();
		b.addPrincipal();
		b.addAdicional();
	}
	
	public void makeSinTacc(Builder b) {
		b.reset();
		b.addPan();
		b.addAderezo();
		b.addPrincipal();
		b.addAdicional();
	}
}
