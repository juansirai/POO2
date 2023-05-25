package practicaOO2.ejercicio11;

public class Dispositivo {
	private Connection connection;
	private Display display;
	private Ringer ringer;
	private Strategy_Calculator calculator;

	
	public Dispositivo() {
		this.connection = new WifiConn(); // por defecto
		this.display = new Display();
		this.ringer = new Ringer();
		this.calculator = new CRC16_Calculator(); // por defecto
	}

	
	public String send(String data) {
		return this.connection.sendData(data, this.calculator.crcFor(data));
	}
	
	
	public String conectar_con(Connection conn) {
		this.connection = conn;
		this.ringer.ring();
		return this.display.showBanner(this.connection.pict());
	}
	
	public String configurarCRC(Strategy_Calculator cal) {
		this.calculator = cal;
		return "Se ha cambiado CRC";
	}

}
