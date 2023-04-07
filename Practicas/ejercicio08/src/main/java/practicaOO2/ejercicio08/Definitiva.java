package practicaOO2.ejercicio08;

public class Definitiva extends EstadoExcursion{

	@Override
	public void inscribir(Usuario u, Excursion contexto) {
		contexto.agregarUsuario(u);
		if(contexto.difMax()==0)
			contexto.setEstado(new Llena());
	}

	
	/*Si la excursión alcanzó el cupo mínimo pero aún no el máximo, la información es la
	 * siguiente: nombre, costo, fechas, punto de encuentro, los mails de los usuarios
	 * inscriptos y cantidad de usuarios faltantes para alcanzar el cupo máximo*/
	@Override
	public String infoExcursion(Excursion contexto) {
		return super.infoExcursion(contexto)
				+"\nMails: "+contexto.getMails()
				+"\nFaltantes para maximo: "+contexto.difMax();
	}

}
