
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		firstName = "NoFirstName";
		lastName = "NoLastName";
		age = 1;
	}
	
	public Person(String ln) {
		firstName = "NoFirstNameYet";
		lastName = ln;
		age = 0;
	}
	
	public Person(String fn, String ln, int a) {
		firstName = fn;
		lastName = ln;
		age = a;
	}
	
	public void introduceSelf() {
		System.out.println("Hello, my name is " + firstName +
				" and I am " + age + " years old.");
	}
}

