package practicaOO2.ejercicio12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Recomendador{

	@Override
	public List<Pelicula> ordenar(Decodificador d) {
		// TODO Auto-generated method stub
		Comparator<Pelicula> compareByPuntaje= (p1,p2) -> Double.compare(p2.getPuntaje(), p1.getPuntaje());
		Comparator<Pelicula> compareByAnio = (p1,p2) -> Double.compare(p2.getAnioEstreno(), p1.getAnioEstreno());
		Comparator<Pelicula> compareBoth = compareByPuntaje.thenComparing(compareByAnio);
		
		return d.getGrilla().stream()
				.sorted(compareBoth)
				.collect(Collectors.toList());
	}

}
