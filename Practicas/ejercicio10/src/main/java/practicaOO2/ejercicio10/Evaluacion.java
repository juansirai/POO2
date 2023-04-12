package practicaOO2.ejercicio10;

public class Evaluacion implements Etapa{

	@Override
	public void aprobarEtapa(Proyecto contexto) {
		contexto.setEtapa(new Confirmada());
		
	}

	@Override
	public void modificarMargen(Proyecto contexto, double margen) {
		if((margen<=0.15) && (margen>=0.11)) {
			contexto.setMargen(margen);
		}
		
	}

}
