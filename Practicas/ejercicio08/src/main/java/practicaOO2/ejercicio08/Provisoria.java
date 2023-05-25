package practicaOO2.ejercicio08;

public class Provisoria extends EstadoExcursion{

	@Override
	public void inscribir(Usuario u, Excursion contexto) {
		contexto.agregarUsuario(u);

		if(contexto.difMin()==0) {
			contexto.setEstado(new Definitiva());
		};
	}

	
	/*Si la excursión no alcanza el cupo mínimo, la información es la siguiente: nombre, costo,
	 * fechas, punto de encuentro, cantidad de usuarios faltantes para alcanzar el cupo
	 * mínimo
	*/
	@Override
	public String infoExcursion(Excursion contexto) {
		// TODO Auto-generated method stub
		return super.infoExcursion(contexto) +"\nFaltantes para minimo: "+contexto.difMin();
	}

}
