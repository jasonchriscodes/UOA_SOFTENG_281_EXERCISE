import java.util.Calendar;

public class Animal { 

	public enum Gender {FEMALE, MALE, NON_BINARY}

	private static int yearNow = Calendar.getInstance().get(Calendar.YEAR);

	protected String name; 
	protected int yearBorn; 
	protected int numLegs; 
	protected Gender gender; 
	
//	public Animal() {
//		name = "Bob";
//		yearBorn = yearNow;
//		numLegs = 123;
//		System.out.println("Constructor for Animal using empty param constructor ");
//	}
	
	public Animal(String name, int yearBorn, int numLegs, Gender gender) {
		this.name = name;
		this.yearBorn = yearBorn;
		this.numLegs = numLegs;
		this.gender = gender;
//		System.out.println("Constructor for Animal: " + name);
	}

	// all animals introduce() themselves the same way
	public void introduce() {
		System.out.print("Hello my name is " + this.name + ". I'm " + (yearNow-yearBorn) + " years old, and I walk on "+ numLegs + " legs.");
		System.out.println(" Nice to meet you.");
	}

	// all animals walk() slightly differently
	public void walk() {
//		if (getClass() == Rabbit.class ) { 
//			System.out.println("I'm a Rabbit, so I hop on my 2 legs!"); 
//		} else if (getClass() == Cat.class) { 
//			System.out.println("I'm a Cat, so I stroll along!"); 
//		} else { 
		System.out.println("Don't know how a " + getClass().getName() + " walks! " + name); 
//		}
	}

}
