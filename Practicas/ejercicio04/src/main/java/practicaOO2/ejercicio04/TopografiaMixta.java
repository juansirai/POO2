package practicaOO2.ejercicio04;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

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
	
	public List<Topografia> getComponents(){
		return this.components;
	}
	
	// TODO; se podria haber hecho con un override al metodo equals! Investigar como funciona
	public boolean esIgualA(Topografia t) {
		if(!(t.getComponents() instanceof List<?>))
				return false;
		
		Iterator<Topografia> t1 = this.components.iterator();
		Iterator<Topografia> t2 = ((List<Topografia>) t.getComponents()).iterator();
		boolean continua = true;
		while (t1.hasNext() && t2.hasNext() && continua) {
		    continua = t1.next().esIgualA(t2.next());
		}
		return continua;
	}
}
