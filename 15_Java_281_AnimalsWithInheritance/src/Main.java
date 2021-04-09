class Main {

	// the method is static is because the main method is static and not allowed a non-static method
	// OR creating an instance of the class it is declared in so creating a new instance main the class that 
	// we are in and then whatever called that instance.moveAnimalTwice
	public static void moveAnimalTwice(Animal animal) { 
	   animal.introduce();   // all Animals can introduce() themselves
	   animal.walk();        // all Animals can walk()
	   
   	   // check if the instance is actually a Cat. If so, chase a mouse!
	   // cast the reference to a Cat reference variable
	   if (animal instanceof Cat) { // use safe guard because class Rabbit cannot be cast to class Cat
		   Cat cat = (Cat) animal;  // cast the Animal reference into a Cat reference
		   cat.chaseMouse();        // access Cat-specific content with the Cat reference 
	   }
	   
	   animal.walk();  // walk() a second time
	   System.out.println();
	}
	
	public static void main(String[] args) {
		
		// benefit using inheritance: do NOT need to describe the type because Rabbit class is also a type
		// also can predefine field such as rabbit has 2 legs, do NOT need to specify here, specify inside 
		// the rabbit class
		// compiler only accept general method for animal in the Rabbit lola = new Rabbit("Lola Bunny", 1996, Animal.Gender.FEMALE); 
		// such as lola.introduce(), lola.walk(), cus later on can put to a cat instance so the code
		// needs to compile and lola might refer to a car later on not always to a rabbit
		Rabbit lola = new Rabbit("Lola Bunny", 1996, Animal.Gender.FEMALE); 
		Cat garfield = new Cat("Garfield", 1978, Animal.Gender.MALE);
		Lion alex = new Lion("Alex", 1990, Animal.Gender.MALE); 
		
//		Animal weirdAnimal = new Animal("Nasser", 1983, 2, Animal.Gender.MALE);

		moveAnimalTwice(lola);
		moveAnimalTwice(garfield);
		moveAnimalTwice(alex);

//		lola.introduce();
//		garfield.introduce();
//		alex.introduce();
//		weirdAnimal.introduce();
		
//		lola.walk();
//		garfield.walk();
//		alex.walk(); // we do NOT overwrite the walk method for lion 
//		
//		garfield.introduce();

	}
}