package practicaOO2.ejercicio03;

public class MediaPlayer {
	private Media media;
	
	public MediaPlayer(Media media) {
		this.media = media;
	}
	
	public void setMedia(Media media) {
		this.media = media;
	}
	public Media getMedia() {
		return this.media;
	}
	
	public String play() {
		return this.media.play();
	}
	public String play(Media media) {
		return media.play();
	}
}
