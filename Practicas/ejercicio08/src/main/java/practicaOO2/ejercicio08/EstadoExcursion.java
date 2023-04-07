package practicaOO2.ejercicio08;

public abstract class EstadoExcursion {
	
	public abstract void inscribir(Usuario u, Excursion contexto);
	
	public String infoExcursion(Excursion contexto) {
		return "Nombre: "+contexto.getNombre() +"\nCosto: "+contexto.getCosto()+"\nFecha:"
				+contexto.getFecha() +"\nPunto encuentro: "+contexto.getPuntoEncuentro();
	};
}
