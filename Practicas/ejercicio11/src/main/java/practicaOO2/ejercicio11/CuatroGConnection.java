package practicaOO2.ejercicio11;

public class CuatroGConnection {
	private String symb;
	
	public CuatroGConnection() {
		this.symb = "4G";
	}
	
	public String transmit(String data, long crc) {
		return "Sending data 4G";
	}
	
	public String symb() {
		return this.symb;
	}

}
