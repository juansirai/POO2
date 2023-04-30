package practicaOO2.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Recomendador{

	@Override
	public List<Pelicula> ordenar(Decodificador d) {
		// ordena por las peliculas mas recientes de la grilla
		return d.getGrilla().stream()
				.sorted( (p1, p2) -> Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
				.collect(Collectors.toList());
	}

}
