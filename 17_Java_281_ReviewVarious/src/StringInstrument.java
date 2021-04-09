
public abstract class StringInstrument extends MusicalInstrument {
	
	// abstract class must be extended by a child class so use protected instead of private
	protected int numberOfStrings;
	
//	zero parameter constructor overwrite from default constructor
//	public StringInstrument() {
//		System.out.println("Making string instrument with ZERO strings!");
//		numberOfStrings = 0;
//	}
	
	public StringInstrument(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}
	
	// we implemented instead of making it abstract method because at the string instrument class level 
	// we have enough information to implement that functionality so it's not need to be abstract method
	public int getNumberOfStrings() {
		return this.numberOfStrings;
	}
	
}
