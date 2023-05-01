package practicaOO2.ejercicio15;

import java.util.List;

public class WeatherWrapper implements WeatherStation{
    private WeatherStation wrapee;
	
    public WeatherWrapper(WeatherStation wrapee) {
    	this.wrapee = wrapee;
    }
    
	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return this.wrapee.getTemperatura();
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return this.wrapee.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return this.wrapee.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturasFahrenheit() {
		// TODO Auto-generated method stub
		return this.wrapee.getTemperaturasFahrenheit();
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return this.wrapee.displayData();
	}

}
