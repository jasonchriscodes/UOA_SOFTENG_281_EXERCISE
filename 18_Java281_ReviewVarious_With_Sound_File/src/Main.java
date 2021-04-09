import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<MuscialInstrument> instruments = new ArrayList<MuscialInstrument>();
		instruments.add(new Bass(4));
		instruments.add(new Guitar());
		instruments.add(new Drums());
		
		for (MuscialInstrument instrument: instruments) {
			instrument.makeSound();
		}
		
	}

}
