package practicaOO2.ejercicio19_Factory;

public class CreatorArquero extends Creator{

	@Override
	public Personaje crearPersonaje(String nombre) {
		// TODO Auto-generated method stub
		return new Arquero(nombre);
	}

}
