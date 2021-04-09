import java.util.Calendar;

public abstract class Animal { // abstract class (Animal) cannot be instantiated to an instance in main such as, 
							   // it will give error message, but concrete class (Rabbit, Cat, Lion) can
							   // useful for: there might be some methods does not have general 
						   	   // meaning of defining it (too abstract to define)
							   // Rabbit lola = new Animal("Lola Bunny", 1996, Animal.Gender.FEMALE); (Wrong)
							   // Rabbit lola = new Rabbit("Lola Bunny", 1996, Animal.Gender.FEMALE); (Right)

	public enum Gender {FEMALE, MALE, NON_BINARY}

	private static int yearNow = Calendar.getInstance().get(Calendar.YEAR);

	// protected can be accessed by the child class
	protected String name; 
	protected int yearBorn; 
	protected int numLegs; 
	protected Gender gender; 
	
//	// constructor that takes no parameter (zero parameter constructor)
//	public Animal() {
//		System.out.println("Constructor for Animal using empty param constructor");
//	}
	
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
	// instead of providing block that does nothing("Don't know how a " + getClass().getName() 
	// + " walks! " + name) , method that use semicolon only should define as an abstract
	
	// NOTE if u want the method to be abstract, the class should be abstract as well
	public abstract void walk();
	
//	{
//		if (getClass() == Rabbit.class ) { 
//			System.out.println("I'm a Rabbit, so I hop on my 2 legs!"); 
//		} else if (getClass() == Cat.class) { 
//			System.out.println("I'm a Cat, so I stroll along!"); 
//		} else { 
//		System.out.println("Don't know how a " + getClass().getName() + " walks! " + name); 
//		}
//	}

}
