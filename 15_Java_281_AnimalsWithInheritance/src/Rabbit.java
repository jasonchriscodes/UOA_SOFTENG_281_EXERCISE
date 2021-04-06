
public class Rabbit extends Animal {

	public Rabbit(String name, int yearBorn, Gender gender) {
		super(name, yearBorn, 2, gender);
//		System.out.println("Constructor for Rabbit: " + name);
	}
	
	@Override
	public void walk() {
		System.out.println("I'm a Rabbit, so I hop on my 2 legs!"); 
	}

	@Override
	public void introduce() {
		System.out.print("Prrrr... ");
		super.introduce();
	}

}
