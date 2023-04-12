package practicaOO2.ejercicio10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private String nombre;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private String objetivo;
	private int numIntegrantes;
	private double costoFijoIntegrantes;
	private double margenGanancia;
	private Etapa etapa;
	private static double GANANCIAESTANDAR = 0.07;
	private static String TEXTOCANCELACION = "(Cancelado)";
	
	
	/*Se crea el proyecto en etapa “En construcción” con
     *nombre, fecha de inicio y fin, objetivo, margen de
	 *ganancia de 7%, un número de integrantes y el monto
	 *de pago por integrante por día.
	 */
	public Proyecto(String nombre, LocalDate fechaIni, LocalDate fechaFin, 
					String objetivo, int numIntegrantes, double costoFijoIntegrantes) {
		
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.numIntegrantes = numIntegrantes;
		this.costoFijoIntegrantes = costoFijoIntegrantes;
		this.margenGanancia = GANANCIAESTANDAR;
		this.etapa = new Construccion();
	}
	
	public void setCostoFijo(double cf) {
		this.costoFijoIntegrantes = cf;
	}
	
	/*
	 * Retorna la suma de los costos de las personas 
	 * involucradas. Considerar que las personas trabaja 
	 * todos los días que dura el proyecto
	 * */
	public double costoProyecto() {
		long daysBetween = ChronoUnit.DAYS.between(this.fechaIni, this.fechaFin);
		return this.numIntegrantes * this.costoFijoIntegrantes * daysBetween ;
	}
	
	
	/*Retorna el valor obtenido luego de aplicar el margen
	 * de ganancia al costo del proyecto
	 * */
	public double precioProyecto() {
		
		return this.costoProyecto() * (1+this.margenGanancia);
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa(this);
	}
	
	public void setEtapa(Etapa e) {
		this.etapa = e;
	}
	
	public void modificarMargen(double margen) {
		this.etapa.modificarMargen(this, margen);
	}
	
	
	// TODO: como hago para que esto no esté publico?
	public void setMargen(double margen) {
		this.margenGanancia = margen;
	}
	
	public void cancelar() {
		if(!this.objetivo.contains(Proyecto.TEXTOCANCELACION)) {
			this.objetivo+=Proyecto.TEXTOCANCELACION;
		}
	}
	
	public String getObjetivo() {
		return this.objetivo;
	}
}
