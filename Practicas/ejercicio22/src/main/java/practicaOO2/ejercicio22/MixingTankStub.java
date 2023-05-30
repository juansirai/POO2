package practicaOO2.ejercicio22;

import java.util.concurrent.ThreadLocalRandom;

public class MixingTankStub extends MixingTank{

	@Override
	public boolean heatPower(int percentage) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean mixerPower(int percentage) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean purge() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double upTo() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		return randomNum;
	}

	@Override
	public double temperature() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		return randomNum;
	}

}
