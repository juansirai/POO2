package practicaOO2.ejercicio21;

import java.time.LocalDate;

public class MamiferoReal implements Mamifero{
	private String identificador;
	private String especie;
	private Mamifero padre;
	private Mamifero madre;
	private LocalDate fechaNacimiento;

	public MamiferoReal(String id, String especie, LocalDate fecha) {
		this.identificador = id;
		this.especie = especie;
		this.fechaNacimiento = fecha;
	}
	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return this.identificador;
	}

	@Override
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
		
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return this.especie;
	}

	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
		
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
		
	}

	@Override
	public Mamifero getPadre() {
		return this.padre;
	}

	@Override
	public void setPadre(Mamifero padre) {
		this.padre = padre;
		
	}

	@Override
	public Mamifero getMadre() {
		return this.madre;
	}

	@Override
	public void setMadre(Mamifero madre) {
		this.madre = madre;
		
	}

	@Override
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}

	@Override
	public Mamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return this.padre.getPadre();
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}

	
	@Override
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		return ancestrosDirectos(mamifero) || ancestrosIndirecto(mamifero) ;
	}
	private boolean ancestrosDirectos(Mamifero mamifero) {
		return this.getMadre().equals(mamifero) || this.getPadre().equals(mamifero);
	}
	
	private boolean ancestrosIndirecto(Mamifero mamifero) {
		return this.getMadre().tieneComoAncestroA(mamifero) || this.getPadre().tieneComoAncestroA(mamifero);
	}


}
