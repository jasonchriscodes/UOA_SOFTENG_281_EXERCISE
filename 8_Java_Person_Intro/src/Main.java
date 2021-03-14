class Main {
	public static void main(String[] args) {

		// -- just one variable to represent Bob, instance / object  
		Person bob = new Person("Bob", "Jones", 18); 
		// new Person means they creating a new custom type (Object type) not a primitive types(int, char, bool, etc.)
		// They are known as reference type variable, example bob and jenny (a memory that tell us the location of Person("Bob", "Jones", 18)
		
		// -- just one variable to represent Jenny
		Person jenny = new Person("Jenny", "Jones", 20); 
		
//		Person someoneElse = null; // a null pointer exception because there is no address that program want to point to
//		someoneElse.introduceSelf();
		
		Person someoneElse = bob; // having 2 variable (bob, someoneElse, pointing the same address)
		someoneElse.introduceSelf();
		
		someoneElse = jenny;
		someoneElse.introduceSelf();
		
//		Person nas = new Person(); // the compiler complains "The constructor Person() is undefined (does not exist)"
		// impossible to create a person instance by specifying nothing as input, there is only one constructor define
		// that means there is only one way to create an instance of the person by provide the parameter (String fn, String ln, int a)
		// if u want to make another instance without that parameter u need to create another constructor
		//		nas.introduceSelf(); goes to variable and it finds where it is in memory then it calls the introduceSelf method on their instance
		//	result is default value Helo, my name is null and I am 0 years old. (did not set the default value)
		
//		Person baby = new Person("Windsor");
//		baby.introduceSelf();
		
//		bob.introduceSelf();
//
//		jenny.introduceSelf();

	}
}