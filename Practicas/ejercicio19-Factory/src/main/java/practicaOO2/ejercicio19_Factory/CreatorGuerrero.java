package practicaOO2.ejercicio19_Factory;

public class CreatorGuerrero extends Creator{

	@Override
	public Personaje crearPersonaje(String nombre) {
		// TODO Auto-generated method stub
		return new Guerrero(nombre);
	}

}
