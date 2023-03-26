package practicaOO2.ejercicio04;

import java.util.List;
import java.util.ArrayList;

public class TopografiaMixta implements Topografia{
	protected List<Topografia> components;
	
	public TopografiaMixta() {
		this.components = new ArrayList<Topografia>();
	};
	
	public void addComponent(Topografia t) {
		this.components.add(t);
	}
	
	public void removeComponent(Topografia t) {
		this.components.remove(t);
	}
	
	public double calcularProporcionAgua() {
		return this.components.stream().mapToDouble(c -> c.calcularProporcionAgua()).sum() / 4;
	}
}
