
public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void setFirstName(String newName) { // firstName setter (method signature(signature of this method), how we can use that method: the name of the method(setFirstName), 
		firstName = newName; // the parameter(takes parameter type String), the return type (not expect a return type), is this static or not (not a static method))
	}

	public void setLastName(String newName) { // lastName setter (method signature(signature of this method), how we can use that method: the name of the method(setLastName), 
		lastName = newName; // the parameter(takes parameter type String), the return type (not expect a return type), is this static or not (not a static method))
	}

	public String getFullName() { // FullName getter (method signature (signature of this method), how we can use that method: the name of the method(getFullName), 
		String name = firstName + " " + lastName; // the parameter(takes no parameter), the return type (String), is this static or not (not a static method))
		return name;
	}
	
	public String getInitial() {
		String initial = firstName.substring(0, 1) + "." + " " +lastName.substring(0, 1) + ".";
		return initial;
	}

	public int getAge() { // getter age
		return age;
	}
	
	public boolean isAdult() {
		return age >= 18;
	}

	public void birthday() {
		age++;
		System.out.println("Happy Birthday " + firstName + "!");
	}

	public void introduceSelf() {
		System.out.println("Hello, my name is " + firstName + 
				" and I am " + age + " years old.");
	}

}

