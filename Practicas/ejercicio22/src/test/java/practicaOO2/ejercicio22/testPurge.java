package practicaOO2.ejercicio22;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testPurge {
	private MixingTank tank;
	private Purge purge;
	
	@BeforeEach
	void setUp() throws Exception{
		this.tank = new MixingTankStub();
		this.purge = new Purge();
	}
	
	@Test
	public void testProcess() {
		this.purge.execute(tank);
		assertTrue(this.purge.isDone());
	}
}
