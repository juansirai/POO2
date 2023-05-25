package practicaOO2.ejercicio11;

public class WifiConn implements Connection{
	private String pict;

	public WifiConn() {
		this.pict = "WIFI";
	}
	@Override
	public String sendData(String data, long crc) {
		// TODO Auto-generated method stub
		return "Sending data WIFI";
	}

	@Override
	public String pict() {
		// TODO Auto-generated method stub
		return this.pict;
	}

}
