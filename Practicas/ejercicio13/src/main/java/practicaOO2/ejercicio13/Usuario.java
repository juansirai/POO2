package practicaOO2.ejercicio13;

public class Usuario {
	private String nombre;
	private String pass;
	
	public Usuario(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean validarPass(String p) {
		return this.pass.equals(p);
	}
}
