class Main {
	public static void main(String[] args) {

		// -- just one variable to represent Bob    
		Person bob = new Person("Bob", "Jones", 18);

		// -- just one variable to represent Jenny
		Person jenny = new Person("Jenny", "Jones", 20);
		
		Person someoneElse = bob;
		someoneElse.introduceSelf();
		
		someoneElse= jenny;
		someoneElse.introduceSelf();
		
//		Person nas = new Person();
//		nas.introduceSelf();
//		
//		Person baby = new Person("Windsor");
//		baby.introduceSelf();
		
//		bob.introduceSelf();
//
//		jenny.introduceSelf();

	}
}