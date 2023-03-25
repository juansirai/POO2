package practicaOO2.ejercicio03;

public class VideoStreamAdapter extends Media{
	private VideoStream adaptee;
	
	public VideoStreamAdapter() {
		this.adaptee = new VideoStream();
	}
	
	public String play() {
		return this.adaptee.reproduce();
	}
}
