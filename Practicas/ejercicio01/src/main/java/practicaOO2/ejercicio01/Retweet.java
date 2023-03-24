package practicaOO2.ejercicio01;

public class Retweet extends Tweet{
	private Tweet origen;
	
	public Retweet(Tweet origen) {
		super(origen.getTexto());
		this.origen = origen;
		
	}
	
	public Tweet getOrigen() {
		return this.origen;
	}
	

}
