package practicaOO2.ejercicio22;

public abstract class MixingTank {
	private L2CDriver driver;

	public abstract boolean heatPower(int percentage);
	
	public abstract boolean mixerPower(int percentage);
	
	public abstract boolean purge();
	
	public abstract double upTo();
	
	public abstract double temperature();
}
