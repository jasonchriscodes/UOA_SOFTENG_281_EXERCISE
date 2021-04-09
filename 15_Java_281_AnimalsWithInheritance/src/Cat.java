
public class Cat extends Animal { // Cat is an animal

	public Cat(String name, int yearBorn, Gender gender) { // String name, int yearBorn, Gender gender 
														   // parameter in windowsill
		super(name, yearBorn, 4, gender); // must call the constructor for animal first 
										  // (super constructor of parent class)
//		System.out.println("Constructor for Cat: " + name);
	}
	
	@Override // overwritten
	public void walk() {
		System.out.println("I'm a Cat, so I stroll along!"); 
	}
	
	@Override // overwritten
	public void introduce() {
		System.out.print("Meow... ");
		super.introduce(); // call parents introduce() method
	}

	public void chaseMouse() {
		System.out.println(name + " is chasing a mouse!! ");
	}
	

}
