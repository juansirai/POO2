package practicaOO2.ejercicio01;

public class Tweet {
    private String texto;
    
    public Tweet(String texto) {
    	this.texto = texto;
    }
    
    public void setTexto(String texto) {
    	this.texto = texto;
    }
    public String getTexto() {
    	return this.texto;
    }
    
    public Retweet retweetear() {
    	Retweet rt = new Retweet(this);
    	return rt;
    }
}
