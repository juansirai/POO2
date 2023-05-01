package practicaOO2.ejercicio15;

import java.util.List;

public class StationAdapter implements WeatherStation{
	private HomeWeatherStation adaptee;
	
	public StationAdapter(HomeWeatherStation adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return this.adaptee.getTemperaturaFahrenheit();
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return this.adaptee.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return this.adaptee.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturasFahrenheit() {
		// TODO Auto-generated method stub
		return this.adaptee.getTemperaturasFahrenheit();
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "";
	}

}
