package practicaOO2.ejercicio15;

public class WrapeeFahrenheit extends WeatherWrapper{

	public WrapeeFahrenheit(WeatherStation wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String displayData() {
		return super.displayData() + "Temperatura Fahrenheit: "+super.getTemperatura();
	}

}
