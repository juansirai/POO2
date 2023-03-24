package practicaOO2.ejercicio01;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Twitter {
	private List <Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	private boolean existeUsuario(Usuario u2) {
		return this.usuarios.stream().anyMatch(t -> t.nameEqual(u2.getName()));
	}
	
	public boolean agregarUsuario(Usuario u) {
		boolean exito = false;
		if(!this.existeUsuario(u)){
			this.usuarios.add(u);
			exito = true;
		}
		return exito;
	}
	
	/*es necesario hacer que tambien se eliminen los retweets que otra gente hizo de mi tweet?*/
	public void eliminarUsuario(Usuario u) {
		Usuario toDelete = this.usuarios.stream()
						   .filter(user -> user.equals(u))
						   .findFirst().orElse(null);
		if(toDelete!=null) {
			toDelete.eliminarTweets();
			this.usuarios.remove(u);
		}
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public List<Tweet> getTweetsSistema(){
		List<Tweet> t = this.usuarios.stream()
						.flatMap(u -> u.getTweets().stream()).collect(Collectors.toList());
		
		return t;
	}
	
}
