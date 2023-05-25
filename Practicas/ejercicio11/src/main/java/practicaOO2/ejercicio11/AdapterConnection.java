package practicaOO2.ejercicio11;

public class AdapterConnection implements Connection{
	private CuatroGConnection adaptee;

	public AdapterConnection() {
		this.adaptee = new CuatroGConnection();
	}
	
	@Override
	public String sendData(String data, long crc) {
		return this.adaptee.transmit(data, crc);
	}
	
	@Override
	public String pict() {
		return this.adaptee.symb();
	}
}
