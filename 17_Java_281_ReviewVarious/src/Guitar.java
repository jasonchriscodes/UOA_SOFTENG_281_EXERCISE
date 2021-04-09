
public class Guitar extends StringInstrument {
	
	public Guitar() {
		super(6);
		System.out.println("Making guitar using no parameters");
	}
		
	@Override
	public void makeSound() {
		if (this.numberOfStrings <= 0) {
			System.out.println("~~~ Guitar sound... ~~~ bang bang bang ~~~");
		} else {
			System.out.println("~~~ Guitar sound... ~~~ lin lin lin ~~~");
		}
	}

}
