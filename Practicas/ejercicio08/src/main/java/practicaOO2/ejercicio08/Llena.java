package practicaOO2.ejercicio08;

public class Llena extends EstadoExcursion{

	@Override
	public void inscribir(Usuario u, Excursion contexto) {
		contexto.agregarUsuarioEspera(u);
	}


}
