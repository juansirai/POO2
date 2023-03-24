package practicaOO2.ejercicio01;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	
	public Usuario() {
		this.tweets = new ArrayList<Tweet>();
	}
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public void setName(String n) {
		this.screenName = n;
	}
	
	public Tweet twitear(String texto) {
		Tweet t = null;
		if(texto.length()>=1 && texto.length()<=280) {
			t = new Tweet(texto);
			this.tweets.add(t);
		}
		return t;
	}
	
	public Retweet retwitear(Tweet t) {
		Retweet rt = t.retweetear();
		this.tweets.add(rt);
		return rt;
	}
	
	public String getName() {
		return this.screenName;
	}
	
	public Tweet lastTweet() {
		return this.tweets.get(this.tweets.size()-1);
	}
	
	public boolean nameEqual(String n) {
		return this.getName().equals(n);
	}
	
	public void eliminarTweets() {
		this.tweets.stream().forEach(t -> t.eliminarRT());
		this.tweets.clear();
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
}
