package practicaOO2.ejercicio11;
import java.util.zip.CRC32;

public class CRC32_Calculator implements Strategy_Calculator{

	@Override
	public long crcFor(String datos) {
		CRC32 crc = new CRC32();
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return result;
	}

}
