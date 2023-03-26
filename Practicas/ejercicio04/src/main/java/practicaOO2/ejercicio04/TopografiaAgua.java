package practicaOO2.ejercicio04;

public class TopografiaAgua implements Topografia{

	
	public double calcularProporcionAgua() {
		return 1;
	}
	
	public boolean esIgualA(Topografia t) {
		return this.calcularProporcionAgua() == t.calcularProporcionAgua();
	}
	
	public TopografiaAgua getComponents() {
		return this;
	}
	
}
