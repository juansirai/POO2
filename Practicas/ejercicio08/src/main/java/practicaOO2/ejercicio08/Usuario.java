package practicaOO2.ejercicio08;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario(String n, String a, String email) {
		this.nombre = n;
		this.apellido = a;
		this.email = email;
	}
	
	public Usuario() {};
	
	public void setEmail(String e) {
		this.email = e;
	}
	public String getEmail() {
		return this.email;
	}
	public void setNombre(String n) {
		this.nombre = n;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setApellido(String a) {
		this.apellido = a;
	}
	public String getApellido() {
		return this.apellido;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+ this.getNombre()+" - Apellido: "+this.getApellido()+" - Email: "+this.getEmail()+" || ";
	}
}
