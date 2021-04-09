import java.io.File;

public class Guitar extends StringInstrument {
	
	public Guitar() {
		super(6);
		soundFile = new File("audio/guitar.wav");
//		System.out.println("Making guitar using no parameters");
	}
		
	@Override
	public void makeSound() {
		if (this.numberOfStrings <= 0) {
			System.out.println("~~~ No strings for the guitar! ~~~ bang bang bang ~~~");
		} else {
			System.out.println("START Guitar sound... ");
			super.playAudio();
			System.out.println("FINISHED Guitar sound... ");
			System.out.println();
		}
	}

}
