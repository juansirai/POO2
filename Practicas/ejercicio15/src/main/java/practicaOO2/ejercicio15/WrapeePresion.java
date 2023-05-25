package practicaOO2.ejercicio15;

public class WrapeePresion extends WeatherWrapper{

	public WrapeePresion(WeatherStation wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Presion: "+super.getPresion();
	}

}
