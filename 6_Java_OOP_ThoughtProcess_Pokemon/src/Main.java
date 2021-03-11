class Main { // The first letter of class usually should be capital
	
	public static void main(String[] args) {

		Pokemon pika = new Pokemon("Pikachu", 10); // 'new' creating an instance of pokemon and providing
		                                           //  some initial value of that pokemon attributes
		pika.details(); // for that particular pokemon instance I wanted to tell me its details
		pika.attack(); // then I wanted to do an attack
		pika.attack();
		pika.attack();
		pika.attack();
		pika.attack();
		pika.attack();
		pika.details(); // then I wanted to tell me its details again
		
		System.out.println();

		Pokemon secondPokemon = new Pokemon("Eevee", 11);
		secondPokemon.details();
		secondPokemon.attack();
		secondPokemon.details();
	}
}