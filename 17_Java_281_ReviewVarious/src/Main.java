
public class Main {

	public static void main(String[] args) {

		System.out.println("Total mucical stuff = " + MuscialInstrument.getNumberOfMusicalInstruments());
		MuscialInstrument myNewInstrument = new Guitar();
		
		System.out.println("Total mucical stuff = " + MuscialInstrument.getNumberOfMusicalInstruments());
		
		Bass ashleysBass = new Bass(4);
		System.out.println("Total mucical stuff = " + MuscialInstrument.getNumberOfMusicalInstruments());
		myNewInstrument = ashleysBass;
		
		myNewInstrument.makeSound();
		
		StringInstrument myStringInstrument = (StringInstrument) myNewInstrument;
		
		
//		System.out.println(myStringInstrument.getNumberOfStrings());
		
	}

}
