import java.util.Calendar;

public class Animal { 

	public enum Gender {FEMALE, MALE, NON_BINARY}

	private int yearNow = Calendar.getInstance().get(Calendar.YEAR);

	private String name; 
	private int yearBorn; 
	private int numLegs; 
	private Gender gender; 

	public Animal(String name, int yearBorn, int numLegs, Gender gender) {
		this.name = name;
		this.yearBorn = yearBorn;
		this.numLegs = numLegs;
		this.gender = gender;
	}

	// all animals introduce() themselves the same way
	public void introduce() {
		System.out.println("Hello, my name is " + name + ". I'm " + (yearNow-yearBorn) + " years old, and I walk on "+ numLegs + " legs.");
	}

	// all animals walk() slightly differently
	public void walk() {
		if (getClass() == Rabbit.class ) { 
			System.out.println("I'm a Rabbit, so I hop on my 2 legs!"); 
		} else if (getClass() == Cat.class) { 
			System.out.println("I'm a Cat, so I stroll along!"); 
		} else { 
			System.out.println("Don't know how a " + getClass().getName() + " walks!"); 
		}
	}

}
