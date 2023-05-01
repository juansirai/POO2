package practicaOO2.ejercicio15;

import java.util.List;

public interface WeatherStation {
	
  public abstract double getTemperatura();
  public abstract double getPresion();
  public abstract double getRadiacionSolar();
  public abstract List<Double> getTemperaturasFahrenheit();
  public abstract String displayData();
}
