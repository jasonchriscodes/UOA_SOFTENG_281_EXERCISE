
public abstract class MusicalInstrument {
	
	private static int totalNumberOfMusicalInstruments = 0;
	
	public MusicalInstrument() {
		System.out.println("Making a musical instrument");
		totalNumberOfMusicalInstruments++;
	}
	
	public static int getNumberOfMusicalInstruments() {
		return totalNumberOfMusicalInstruments;
	}
	
	// we can NOT to make a sound for it that is relevant to musical instruments in general so its abstract
	public abstract void makeSound();
	
	// OR
//	public void makeSound() {
//		
//	}
	
}
