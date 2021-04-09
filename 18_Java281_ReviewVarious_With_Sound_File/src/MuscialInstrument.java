import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public abstract class MuscialInstrument {
	
	private static int totalNumberOfMusicalInstruments = 0;
	
	protected File soundFile;
	
	public MuscialInstrument() {
//		System.out.println("Making a musical instrument");
		totalNumberOfMusicalInstruments++;
	}
	
	public static int getNumberOfMusicalInstruments() {
		return totalNumberOfMusicalInstruments;
	}
	
	public abstract void makeSound();
	
	protected void playAudio() {
		try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);	        
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	        
	        CountDownLatch syncLatch = new CountDownLatch(1);
	        clip.addLineListener(new LineListener() {
				@Override
				public void update(LineEvent event) {
				if (event.getType() == LineEvent.Type.STOP) {
		              syncLatch.countDown();
		            }
				}
			});
	        syncLatch.await(10000, TimeUnit.MILLISECONDS);
//	        System.out.println("Finished playing " + soundFile.getName());
	    } catch(Exception ex) {
	        ex.printStackTrace();
	    }
	}

	
}
