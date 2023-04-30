package practicaOO2.ejercicio13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
		if (sesionIniciada)
			return this.database.getSearchResults(queryString);
		else
			return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(sesionIniciada)
			return this.database.insertNewRow(rowData);
		else
			return -1;
	}

}
