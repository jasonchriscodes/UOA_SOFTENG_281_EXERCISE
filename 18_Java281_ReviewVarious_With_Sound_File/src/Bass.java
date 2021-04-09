import java.io.File;

public class Bass extends StringInstrument {
	
	public Bass(int numberOfStrings) {
		super(numberOfStrings);
		soundFile = new File("audio/bass.wav");
	}
	
	@Override
	public void makeSound() {
		System.out.println("START Bass sound... ");
		super.playAudio();
		System.out.println("FINISHED Bass sound... ");
		System.out.println();
	}

}
