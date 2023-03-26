package practicaOO2.ejercicio04;

public class TopografiaPantano implements Topografia{
	public double calcularProporcionAgua() {
		return 0.7;
	}
	
	public boolean esIgualA(Topografia t) {
		return this.calcularProporcionAgua() == t.calcularProporcionAgua();
	}
	
	public TopografiaPantano getComponents() {
		return this;
	}
}
