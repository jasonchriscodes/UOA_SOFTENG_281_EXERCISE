
public class Person { // define custom type (person class)
	private String firstName = null; // set default value for field unless changed by a constructor
	private String lastName = null;
	private int age = 123;
	
	public Person() { // make default value with default constructor
		firstName = "NoFirstName";
		lastName = "NoLastName";
//		age = 1;
	}

//  Note/ if the constructor does not match the instance input, it will complain (order, number of input)
	public Person(String ln) { // 1st constructor, we need make constructor with different type combination
		// otherwise, the compiler will confuse which one should be used, 
		// compiler will ignore ln word and just see the type
		firstName = "NoFirstNameYet";
		lastName = ln;
		age = 0;
	}

	public Person(String fn, String ln, int a) { // 2nd constructor of the person class, filling the field of each instance 
		firstName = fn;	// each instance will have field firstName, lastName, age
		lastName = ln;
		age = a;
	}

//	public Person(String fn = firstName, String lastName, int 10) { we CANNOT initialised variable in parenthese in java
//	}
	
	public void introduceSelf() {
		System.out.println("Hello, my name is " + firstName + 
				" and I am " + age + " years old.");
	}

}

