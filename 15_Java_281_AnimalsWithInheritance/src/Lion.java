
public class Lion extends Animal{

	public Lion(String name, int yearBorn, Animal.Gender gender) {
		super(name, yearBorn, 5, gender); // we do NOT overwrite the walk method for lion 
//		System.out.println("Constructor for Lion: " + name);
	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		System.out.println("Roarrrrr.....");
		super.introduce();
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I'm a lion, and I walk like a boss.");
	}
	
}
