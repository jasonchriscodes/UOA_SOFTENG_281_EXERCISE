class Main {
	
	public static void main(String[] args) {

		Pokemon pika = new Pokemon("Pikachu", 10);
		
		pika.details();
		pika.attack();
		pika.details();
		
		System.out.println();

		Pokemon secondPokemon = new Pokemon("Eevee", 11);
		secondPokemon.details();
		secondPokemon.attack();
		secondPokemon.details();
	}
}