package practicaOO2.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo dis;
	
	@BeforeEach
	void setUp() throws Exception{
		this.dis = new Dispositivo();
	}
	
	@Test
	public void testSend() {
		assertEquals("Sending data WIFI", this.dis.send("Hola"));
		// changing connection
		AdapterConnection cuatro = new AdapterConnection();
		this.dis.conectar_con(cuatro);
		assertEquals("Sending data 4G", this.dis.send("Hola"));
	}
	
	@Test
	public void testConectarCon() {
		AdapterConnection cuatro = new AdapterConnection();
		assertEquals("4G", this.dis.conectar_con(cuatro));
		assertEquals("Sending data 4G", this.dis.send("Hola"));
		
		WifiConn wifi = new WifiConn();
		assertEquals("WIFI", this.dis.conectar_con(wifi));
		assertEquals("Sending data WIFI", this.dis.send("Hola"));
	}
	
	@Test
	public void testConfigurarCRC() {
		assertEquals("Se ha cambiado CRC", this.dis.configurarCRC(new CRC16_Calculator()));
		assertEquals("Se ha cambiado CRC", this.dis.configurarCRC(new CRC32_Calculator()));
	}
}
