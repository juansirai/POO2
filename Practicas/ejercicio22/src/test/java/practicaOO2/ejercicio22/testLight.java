package practicaOO2.ejercicio22;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testLight {
	private MixingTank tank;
	private LightMix light;
	
	@BeforeEach
	void setUp() throws Exception{
		this.tank = new MixingTankStub();
		this.light = new LightMix();
	}
	
	@Test
	public void testProcess() {
		this.light.execute(tank);
		assertTrue(this.light.isDone());
	}
}
