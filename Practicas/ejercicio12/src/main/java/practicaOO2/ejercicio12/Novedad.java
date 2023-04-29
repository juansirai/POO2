package practicaOO2.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Recomendador{

	@Override
	public List<Pelicula> ordenar(Decodificador d) {
		// TODO Auto-generated method stub
		return d.getGrilla().stream()
				.sorted( (p1, p2) -> Integer.compare(p1.getAnioEstreno(), p2.getAnioEstreno()))
				.collect(Collectors.toList());
	}

}
