package practicaOO2.ejercicio04;

public class TopografiaTierra implements Topografia{

	
	public double calcularProporcionAgua() {
		return 0;
	}
	
	public boolean esIgualA(Topografia t) {
		return this.calcularProporcionAgua() == t.calcularProporcionAgua();
	}
	
	public TopografiaTierra getComponents() {
		return this;
	}
}
