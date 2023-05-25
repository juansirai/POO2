package practicaOO2.ejercicio08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private String puntoEncuentro;
	private double costo;
	private int cupo_minimo;
	private int cupo_maximo;
	private List<Usuario>inscriptos;
	private List<Usuario>listaEspera;
	private EstadoExcursion estado;
	
	
	/*
	 * Constructor de excursion, 
	 * con lista de inscriptos y de espera vacías, y estado provisoria
	 */
	public Excursion(String n, LocalDate f, String pe, double c, int c_min, int c_max) {
		this.nombre = n;
		this.fechaInicio = f;
		this.puntoEncuentro = pe;
		this.costo = c;
		this.cupo_minimo = c_min;
		this.cupo_maximo = c_max;
		this.inscriptos = new ArrayList<Usuario>();
		this.listaEspera = new ArrayList<Usuario>();
		this.estado = new Provisoria();
	}
	
	/*
	 * Inscribe a un usuario a una excursion
	 * Si aún no se alcanzó el cupo mínimo, la inscripción se considera provisoria. 
	 * Cuando se alcanza el cupo mínimo, la inscripción se considera definitiva y podrá llevarse a cabo.
	 * Cuando se alcanza el cupo máximo, la excursión solo registrará nuevos inscriptos en su lista de espera
	 * */
	public void inscribir(Usuario u) {
		this.estado.inscribir(u, this);
	}
	
	/*
	 * - Si la excursión no alcanza el cupo mínimo: nombre, costo, fechas, punto de encuentro, 
	 * cantidad de usuarios faltantes para alcanzar el cupo mínimo.
	 * - Si la excursión alcanzó el cupo mínimo pero aún no el máximo: nombre, costo, fechas, punto de encuentro, los mails de los usuarios
	 * inscriptos y cantidad de usuarios faltantes para alcanzar el cupo máximo.
	 * - Si la excursión alcanzó el cupo máximo, la información solamente incluye nombre, costo, fechas y punto de encuentro.
	 * 
	 */
	public String infoExcursion() {
		return this.estado.infoExcursion(this);
	}
	
	public void setEstado(EstadoExcursion e) {
		this.estado = e;
	}
	
	public int cantInscriptos() {
		return this.inscriptos.size();
	}
	
	public int cantEspera() {
		return this.listaEspera.size();
	}
	
	public int getMax() {
		return this.cupo_maximo;
	}
	
	public int getMin() {
		return this.cupo_minimo;
	}
	
	public int difMin() {
		return this.getMin() - this.cantInscriptos() ;
	}
	
	public int difMax() {
		return this.getMax() - this.cantInscriptos();
	}
	
	// TODO: es preferible dejar estos métodos publicos? O darle la potestad al estado para que acceda a la lista?
	
	public void agregarUsuario(Usuario u) {
		this.inscriptos.add(u);
	}
	
	public void agregarUsuarioEspera(Usuario u) {
		this.listaEspera.add(u);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getPuntoEncuentro() {
		return this.puntoEncuentro;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public LocalDate getFecha() {
		return this.fechaInicio;
	}
	
	public String getMails() {
		List<String>mails = this.inscriptos.stream()
							.map(u -> u.getEmail())
							.collect(Collectors.toList());
		return String.join(", ", mails);
	}
	
	public EstadoExcursion getEstado() {
		return this.estado;
	}
	
}
