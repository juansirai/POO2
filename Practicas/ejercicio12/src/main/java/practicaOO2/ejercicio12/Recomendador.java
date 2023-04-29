package practicaOO2.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Recomendador {

	public List<Pelicula> recomendar(Decodificador d){
		List<Pelicula> recomendadas = this.ordenar(d).stream()
									  .filter(p -> !d.getReproducidas().contains(p))
									  .limit(3)
									  .collect(Collectors.toList());
		return recomendadas;
	}
	
	/*
	 * retorna la grilla ordenada por criterio
	 * 
	 */
	protected abstract List<Pelicula> ordenar(Decodificador d);
}
