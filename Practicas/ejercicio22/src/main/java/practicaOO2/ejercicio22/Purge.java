package practicaOO2.ejercicio22;

public class Purge extends ProcessStep{

	@Override
	protected boolean basicExecute(MixingTank tank) {
		// TODO Auto-generated method stub
		return (tank.heatPower(0)&&
				tank.mixerPower(0)&&
				tank.purge());
	}

}
