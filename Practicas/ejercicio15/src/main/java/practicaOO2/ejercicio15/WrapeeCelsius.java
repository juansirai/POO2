package practicaOO2.ejercicio15;

public class WrapeeCelsius extends WeatherWrapper{

	public WrapeeCelsius(WeatherStation wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String displayData() {
		return super.displayData() + "Temperatura Celsius: "+this.getCelsius();
	}
	
	private double getCelsius() {
		return (super.getTemperatura()-32)/1.8;
	}
}
