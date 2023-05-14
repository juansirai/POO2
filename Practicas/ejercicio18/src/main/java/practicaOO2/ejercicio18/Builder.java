package practicaOO2.ejercicio18;

public interface Builder {
	public abstract void reset();
	public abstract void addPan();
	public abstract void addPrincipal();
	
	// TODO: se podrían poner directamente en las clases concretas?
	public abstract void addAderezo();
	public abstract void addAdicional();
}
