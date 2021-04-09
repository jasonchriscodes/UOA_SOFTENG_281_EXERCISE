
public abstract class StringInstrument extends MuscialInstrument {
	
	protected int numberOfStrings;
	
//	public StringInstrument() {
//		System.out.println("Making string instrument with ZERO strings!");
//		numberOfStrings = 0;
//	}
	
	public StringInstrument(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}
	
	public int getNumberOfStrings() {
		return this.numberOfStrings;
	}
	
}
