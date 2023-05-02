package practicaOO2.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestWeatherStation {

	private WeatherStation station;
	private HomeWeatherStation hw;
	
	@BeforeEach
	void setUp() throws Exception{
		this.hw = new HomeWeatherStation();
		this.hw.setPresion(1008);
		this.hw.setRadiacionSolar(500);
		this.hw.setTemperaturaF(82.4);
		this.hw.censar(10.0);
		this.hw.censar(20.0);
		this.hw.censar(30.0);
		
		this.station = new StationAdapter(hw);
	}
	
	@Test
	public void testEjemploUno() {
		WeatherStation presion = new WrapeePresion(station);
		assertEquals(" Presion: 1008.0", presion.displayData());
	}
	
	@Test
	public void testEjemploDos() {
		WeatherStation presion = new WrapeePresion(station);
		WeatherStation radiacion = new WrapeeRadiacion(presion);
		assertEquals(" Presion: 1008.0 Radiacion: 500.0", radiacion.displayData());
	}
	
	@Test
	public void testEjemploTres() {
		WeatherStation radiacion = new WrapeeRadiacion(station);
		WeatherStation celsius = new WrapeeCelsius(radiacion);
		WeatherStation average = new WrapeePromedioF(celsius);
		assertEquals(" Radiacion: 500.0 Temperatura Celsius: 28.0 Promedio Temperaturas: 20.0", average.displayData());
		
	}
}
