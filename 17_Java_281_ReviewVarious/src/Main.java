
public class Main {

	public static void main(String[] args) {
		
		MuscialInstrument myNewInstrument = new Guitar();
		
		myNewInstrument.makeSound();
		
		StringInstrument myStringInstrument = (StringInstrument) myNewInstrument;
		
		
		System.out.println(myStringInstrument.getNumberOfStrings());
		
	}

}
