package practicaOO2.ejercicio10;

public class Construccion implements Etapa{

	@Override
	public void aprobarEtapa(Proyecto contexto) {
		if(contexto.precioProyecto()>0) {
			contexto.setEtapa(new Evaluacion());
		}
		else {
			throw new RuntimeException("El precio del proyecto es cero.");
		}
		
	}

}
