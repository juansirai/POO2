package practicaOO2.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {
	private double temperaturaFahrenheit;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturasCensadas;
	
	public HomeWeatherStation() {
		this.temperaturasCensadas = new ArrayList<Double>();
	}
	
	public void setTemperaturaF(double t) {
		this.temperaturaFahrenheit = t;
	}
	public double getTemperaturaFahrenheit() {
		return this.temperaturaFahrenheit;
	}
	
	public void setPresion(double p) {
		this.presion = p;
	}
	public double getPresion() {
		return this.presion;
	}
	
	public void setRadiacionSolar(double r) {
		this.radiacionSolar = r;
	}
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}
	
	//se agrega a efectos de prueba.. si quisiera mantener exactamente la misma interface debería ponerlo en el constructor ya inicializado y cargado.
	public void censar(Double t) {
		this.temperaturasCensadas.add(t);
	}
	
	public List<Double>getTemperaturasFahrenheit(){
		return this.temperaturasCensadas;
	}
	

}
