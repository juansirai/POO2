package practicaOO2.ejercicio15;

public class WrapeePromedioF extends WeatherWrapper{

	public WrapeePromedioF(WeatherStation wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String displayData() {
		return super.displayData()+"Promedio Temperaturas: "+this.getPromedio();
		
	}
	
	private double getPromedio() {
		return super.getTemperaturasFahrenheit()
				.stream().mapToDouble(t->t.doubleValue())
				.average().orElse(0);
	}

}
