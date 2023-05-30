package practicaOO2.ejercicio22;

public class LightMix extends ProcessStep{

	@Override
	protected boolean basicExecute(MixingTank tank) {
		// TODO Auto-generated method stub
		return (tank.heatPower(20) && tank.mixerPower(5));
	}

}
