
public class Bass extends StringInstrument {
	
	public Bass(int numberOfStrings) {
		super(numberOfStrings);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Bass sound... bmmm bmmm bnmmm");
	}

}
