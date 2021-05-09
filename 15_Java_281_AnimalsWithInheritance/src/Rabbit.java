
public class Rabbit extends Animal { // Rabbit is an animal

	public Rabbit(String name, int yearBorn, Gender gender) {
		super(name, yearBorn, 2, gender); // must call the constructor for animal first 
		                                  // (super constructor of parent class)
//		System.out.println("Constructor for Rabbit: " + name);
	}
	
	@Override // overwritten
	public void walk() {
		System.out.println("I'm a Rabbit, so I hop on my 2 legs!"); 
	}

	@Override // overwritten
	public void introduce() {
		System.out.print("Prrrr... ");
		super.introduce(); // call parents introduce() method
	}
	

}
