package practicaOO2.ejercicio01;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public Tweet twitear(String texto) {
		Tweet t = null;
		if(texto.length()>=1 && texto.length()<=280) {
			t = new Tweet(texto);
		}
		return t;
	}
}
