package practicaOO2.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Recomendador{

	@Override
	public List<Pelicula> ordenar(Decodificador d) {
		List<Pelicula> pelisSimilares = d.getReproducidas().stream()
									    .map(p -> p.getSimilares())
									    .collect(Collectors.toList())
									    .stream()
									    .flatMap(List::stream).collect(Collectors.toList())
									    .stream().distinct().collect(Collectors.toList());
										//TODO: Hay alguna forma mas directa?
		
		return d.getGrilla().stream()
				.filter(p -> pelisSimilares.contains(p))
				.sorted( (p1,p2) -> Double.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
				.collect(Collectors.toList());
	}

}
