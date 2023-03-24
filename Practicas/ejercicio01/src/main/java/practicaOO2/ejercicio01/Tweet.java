package practicaOO2.ejercicio01;

import java.util.List;
import java.util.ArrayList;

public class Tweet {
    private String texto;
    private List<Retweet> retweets;
    
    public Tweet(String texto) {
    	this.texto = texto;
    	this.retweets = new ArrayList<Retweet>();
    }
    
    public void setTexto(String texto) {
    	this.texto = texto;
    }
    public String getTexto() {
    	return this.texto;
    }
    
    public Retweet retweetear() {
    	Retweet rt = new Retweet(this);
    	this.retweets.add(rt);
    	return rt;
    }
    
    public void eliminarRT() {
    	this.retweets.clear();
    }
    
    public List<Retweet> getRT(){
    	return this.retweets;
    }
}
