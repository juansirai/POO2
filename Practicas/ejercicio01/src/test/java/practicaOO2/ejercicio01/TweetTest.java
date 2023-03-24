package practicaOO2.ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TweetTest {
	Tweet t1, t2;
	
	@BeforeEach
	void setUp() throws Exception {
		t1 = new Tweet("Hola");
		t2 = new Tweet("Hola2");
	}
	
	@Test
	public void retweetear() {
		Retweet rt = t1.retweetear();
		assertEquals(t1, rt.getOrigen());
		assertEquals(t1.getTexto(), rt.getTexto());
		assertFalse(t2.equals(rt.getOrigen()));
	}
	
	@Test
	public void eliminarRT() {
		Retweet rt1 = t1.retweetear();
		Retweet rt2 = t1.retweetear();
		Retweet rt3 = t1.retweetear();
		assertEquals(3, t1.getRT().size());
		t1.eliminarRT();
		assertEquals(0, t1.getRT().size());
	}
}
