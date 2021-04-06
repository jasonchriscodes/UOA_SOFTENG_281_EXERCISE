
public class Cat extends Animal {

	public Cat(String name, int yearBorn, Gender gender) {
		super(name, yearBorn, 4, gender);
//		System.out.println("Constructor for Cat: " + name);
	}
	
	@Override
	public void walk() {
		System.out.println("I'm a Cat, so I stroll along!"); 
	}
	
	@Override
	public void introduce() {
		System.out.print("Meow... ");
		super.introduce();
	}


}
