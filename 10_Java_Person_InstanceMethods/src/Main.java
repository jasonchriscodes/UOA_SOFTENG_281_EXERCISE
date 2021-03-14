class Main {
	public static void main(String[] args) {

		Person bob = new Person("Bob", "Jones", 18);
		Person jenny = new Person("Jenny", "Jones", 20);

		/*
	    Call a getter method on an instance (Bob). 
	    Save it to a local variable.
	    And then print it afterwards.
		 */ 
		String name = bob.getFullName(); // save the variable "Bob" in the name variable
		System.out.println(name);

		/* 
	    Call the same getter method, but a different instance (Jenny).
	    Here, we also print the returned result directly.
		 */
		System.out.println(jenny.getFullName()); // not saving the variable, just printed out

		/*
    	Call a getter method to change Bob's name to Bobby.
		 */
		bob.setFirstName("Bobby");

		/* 
	    Call the getter method again to see the impact.
	    Notice only Bob's name changed.
		 */
		System.out.println(bob.getFullName());
		System.out.println(jenny.getFullName());

		/* 
    	Call ordinary instance methods.
		 */
		bob.introduceSelf();
		jenny.introduceSelf();

		/*
    	Jenny has a birthday.
		 */
		jenny.birthday();

		/* 
    	Let's see the impact.
		 */
		bob.introduceSelf();
		jenny.introduceSelf();

	}
}