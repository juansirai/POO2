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

	@Override
	public void modificarMargen(Proyecto contexto, double margen) {
		if(margen<=0.1 && margen>=0.08) {
			contexto.setMargen(margen);
		}
		
	}

}
