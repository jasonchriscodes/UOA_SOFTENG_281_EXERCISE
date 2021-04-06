class Main {

	public static void moveAnimalTwice(Animal animal) { 
	   animal.introduce();   // all Animals can introduce() themselves
	   animal.walk();        // all Animals can walk()
	   
	   if (animal instanceof Cat) {
		   Cat cat = (Cat) animal;
		   cat.chaseMouse();   
	   }
	   
	   animal.walk(); 
	   System.out.println();
	}
	
	public static void main(String[] args) {

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
//		alex.walk();
//		
//		garfield.introduce();

	}
}