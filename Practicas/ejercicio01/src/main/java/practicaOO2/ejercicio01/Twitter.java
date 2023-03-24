package practicaOO2.ejercicio01;

import java.util.List;
import java.util.ArrayList;

public class Twitter {
	List <Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	private boolean existeUsuario(String n1) {
		return this.usuarios.stream().anyMatch(t -> t.nameEqual(n1));
	}
	
	public boolean agregarUsuario(String name) {
		boolean exito = false;
		if(!this.existeUsuario(name)){
			Usuario u = new Usuario(name);
			this.usuarios.add(u);
			exito = true;
		}
		return exito;
	}
	
	public void eliminarUsuario(Usuario u) {
		Usuario toDelete = this.usuarios.stream()
						   .filter(user -> user.equals(u))
						   .findFirst().orElse(null);
		if(toDelete!=null)
			toDelete.eliminarTweets();
	}
}
