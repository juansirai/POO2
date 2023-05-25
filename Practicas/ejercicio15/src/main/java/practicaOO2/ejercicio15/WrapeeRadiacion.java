package practicaOO2.ejercicio15;

public class WrapeeRadiacion extends WeatherWrapper{

	public WrapeeRadiacion(WeatherStation wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return super.displayData() + " Radiacion: "+super.getRadiacionSolar();
	}
}
