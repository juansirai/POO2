package practicaOO2.ejercicio13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseProxy implements DatabaseAccess{
	private boolean sesionIniciada;
	private List<Usuario> usuarios;
	private DatabaseRealAccess database;
	
	public DatabaseProxy() {
		super(); //TODO: es necesario??
		this.sesionIniciada = false;
		this.usuarios = new ArrayList<Usuario>();
		this.database = new DatabaseRealAccess();
	}

	public void registrarUsuario(Usuario u) {
		boolean existe = this.usuarios.stream()
				         .anyMatch(us -> us.getNombre().equals(u.getNombre()));
		if(!existe)
			this.usuarios.add(u);
	}
	
	/*
	 * Busca el nombre de usuario en la lista de usuarios registrados
	 * Si lo encuentra, solicita validar contraseña, dejando el resultado como estado.
	 * */
	public void iniciarSesion(String u, String p) {
		boolean exito = false;
		Usuario usuario = this.usuarios.stream()
				          .filter(us -> us.getNombre().equals(u))
				          .findFirst().orElse(null);
		if(usuario!=null) {
			exito = usuario.validarPass(p);
		}
		this.sesionIniciada = exito;
		if(!exito)
			Logger.getLogger("proxy").log(Level.SEVERE,"Error en inicio de sesion");
	}
	
	
	public void cerrarSesion(String u, String p) {
		Usuario usuario = this.usuarios.stream()
				          .filter(us -> us.getNombre().equals(u))
				          .findFirst().orElse(null);
		if(usuario!=null && usuario.validarPass(p)) {
			this.sesionIniciada=false;
		}
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		Collection<String> query = null;
		if (sesionIniciada) {
			query =  this.database.getSearchResults(queryString);
			Logger.getLogger("proxy").log(Level.INFO,"Busqueda Valida");
		}
		return query;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		int rows = -1;
		if(sesionIniciada) {
			rows =  this.database.insertNewRow(rowData);
			Logger.getLogger("proxy").log(Level.WARNING, "Insersion exitosa");
		}
		return rows;
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}

}
