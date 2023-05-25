package practicaOO2.ejercicio15;

public class WrapeePromedioF extends WeatherWrapper{

	public WrapeePromedioF(WeatherStation wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String displayData() {
		return super.displayData()+" Promedio Temperaturas: "+this.getPromedio();
		
	}
	
	private double getPromedio() {
		double raw= super.getTemperaturasFahrenheit()
				.stream().mapToDouble(t->t.doubleValue())
				.average().orElse(0);
		return Math.round(raw*100.0)/100.0;
	}

}
