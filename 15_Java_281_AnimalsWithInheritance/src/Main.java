class Main {

	public static void main(String[] args) {

		Rabbit lola = new Rabbit("Lola Bunny", 1996, Animal.Gender.FEMALE);
		Cat garfield = new Cat("Garfield", 1978, Animal.Gender.MALE);

		lola.walk();
		garfield.walk();

	}
}