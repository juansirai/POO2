package practicaOO2.refactoring_ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {
	private List<Persoona> usuarios = new ArrayList<Persoona>(); 
	private SortedSet<String> guiaTelefonica = new TreeSet<String>();
	
	
	public boolean agregarTelefono(String telefono) {	
		if (!this.existeTelefono(telefono)) {
			this.guiaTelefonica.add(telefono);
		}
		return this.existeTelefono(telefono);
	}
	
	private boolean existeTelefono(String telefono) {
		return this.guiaTelefonica.contains(telefono);
	}
	
	private String obtenerNumeroLibre() {
		String tel = this.guiaTelefonica.last();
		this.guiaTelefonica.remove(tel);
		return tel;
	}

	public PersonaFisica registrarUsuarioFisico(String dni, String nombre) {
		String tel = this.obtenerNumeroLibre(); 
		PersonaFisica usuario = new PersonaFisica(nombre, tel, dni);
		agregarUsuarioALista(usuario);
		return usuario;	
	}

	public PersonaJuridica registrarUsuarioJuridico(String cuit, String nombre) {
		String tel = this.obtenerNumeroLibre(); 
		PersonaJuridica usuario = new PersonaJuridica(nombre, tel, cuit);
		agregarUsuarioALista(usuario);
		return usuario;	
	}
	
	private void agregarUsuarioALista(Persoona usuario) {
		if(!existeUsuario(usuario)){
			this.usuarios.add(usuario);
		}
	}
	
	public boolean eliminarUsuario(Persoona p) {
		boolean borre = false;
		if(this.existeUsuario(p)) {
			this.usuarios.remove(p);
			borre = true;
			this.agregarTelefono(p.getTel());
		}
		return borre;
		
	}

	public LlamadaNacional registrarLlamadaNacional(Persoona emisor, Persoona receptor, int duracion) {
		LlamadaNacional llamada = new LlamadaNacional(emisor.getTel(), receptor.getTel(),duracion);
		agregarLlamadaLista(emisor, llamada);
		return llamada;
		
	}

	public LlamadaInternacional registrarLlamadaInternacional(Persoona emisor, Persoona receptor, int duracion) {
		LlamadaInternacional llamada = new LlamadaInternacional(emisor.getTel(), receptor.getTel(),duracion);
		agregarLlamadaLista(emisor, llamada);
		return llamada;
	}
	
	private void agregarLlamadaLista(Persoona emisor, Llamada llamada) {
		emisor.agregarLlamada(llamada);
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		double c = 0;
		if (this.existeUsuario(p))
			c = p.calcularMontoLlamadas();
		return c;
	}

	public int cantidadDeUsuarios() {
		return getUsuarios().size();
	}

	public boolean existeUsuario(Persoona persona) {
		return getUsuarios().contains(persona);
	}

	
	private List<Persoona> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Persoona> usuarios) {
		this.usuarios = usuarios;
	}



	
}
