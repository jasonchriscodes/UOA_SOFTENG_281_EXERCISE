class Main {

	public static void main(String[] args) {

		Rabbit lola = new Rabbit("Lola Bunny", 1996, Animal.Gender.FEMALE);
		Cat garfield = new Cat("Garfield", 1978, Animal.Gender.MALE);
		
//		Animal weirdAnimal = new Animal("Nasser", 1983, 2, Animal.Gender.MALE);

//		lola.walk();
//		garfield.walk();
		garfield.introduce();
//		weirdAnimal.walk();

	}
}