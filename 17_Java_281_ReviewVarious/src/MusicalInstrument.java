
public abstract class MuscialInstrument {
	
	private static int totalNumberOfMusicalInstruments = 0;
	
	public MuscialInstrument() {
		System.out.println("Making a musical instrument");
		totalNumberOfMusicalInstruments++;
	}
	
	public static int getNumberOfMusicalInstruments() {
		return totalNumberOfMusicalInstruments;
	}
	
	public abstract void makeSound();
	
}
