
public class Rabbit extends Animal {

	public Rabbit(String name, int yearBorn, Gender gender) {
		super(name, yearBorn, 2, gender);
		System.out.println("Constructor for Rabbit: " + name);
	}

}
