class Main {
	public static void main(String[] args) {

		// Colour1:
		// calls the default constructor of Colour1
		Colour1 c1 = new Colour1();
		c1.details();

		// Colour2:
		// calls the zero-parameter constructor of Colour2
		Colour2 c2 = new Colour2();
		c2.details();

		// Colour3: 
		// calls the zero-parameter constructor of Colour3
		Colour3 c3 = new Colour3();
		c3.details();

		// calls the one-parameter constructor of Colour3
		Colour3 c4 = new Colour3(55);
		c4.details();

		// calls the three-parameter constructor of Colour3
		Colour3 c5 = new Colour3(5, 10, 15);
		c5.details();

	}
}