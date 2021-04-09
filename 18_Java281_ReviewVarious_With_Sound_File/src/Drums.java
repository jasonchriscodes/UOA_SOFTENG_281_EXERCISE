import java.io.File;

public class Drums extends MuscialInstrument {

	public Drums() {
		soundFile = new File("audio/drums.wav");
	}
	
	@Override
	public void makeSound() {
		System.out.println("START Drums sound... ");
		super.playAudio();
		System.out.println("FINISHED Drums sound... ");
		System.out.println();
	}
}
