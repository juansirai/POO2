package practicaOO2.ejercicio15;

public class WrapeeCelsius extends WeatherWrapper{

	public WrapeeCelsius(WeatherStation wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Temperatura Celsius: "+this.getCelsius();
	}
	
	private double getCelsius() {
		double raw = (super.getTemperatura()-32)/1.8;
		return Math.round(raw * 100.0)/100.0;
	}
}
