
public class Main {

	public static void main(String[] args) {

		System.out.println("Total mucical stuff = " + MusicalInstrument.getNumberOfMusicalInstruments());
		MusicalInstrument myNewInstrument = new Guitar();
		
		System.out.println("Total mucical stuff = " + MusicalInstrument.getNumberOfMusicalInstruments());
		
		Bass ashleysBass = new Bass(4);
		System.out.println("Total mucical stuff = " + MusicalInstrument.getNumberOfMusicalInstruments());
		myNewInstrument = ashleysBass;
		
		myNewInstrument.makeSound();
		
		// put the referenced of type StringInstrument / Guitar, to more specifically said that it's a 
		// StringInstrument cannot say StringInstrument myStringInstrument = new Guitar; because it's not 
		// declared a new Guitar (have 2 guitar instances) but it must use StringInstrument myStringInstrument 
		// = (StringInstrument) myNewInstrument; to only refer to a Guitar instance that we have already had
		StringInstrument myStringInstrument = (StringInstrument) myNewInstrument;
		
// 		this is not working because from the compiler point of view myNewInstrument is a MusicalInstrument type
//		but is not a concrete musical instrument so cannot call getNumberOfStrings()
//		System.out.println(myStringInstrument.getNumberOfStrings());
		
	}

}
