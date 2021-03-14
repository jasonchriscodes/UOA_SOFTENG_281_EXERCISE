
public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String fn, String ln, int a) {
		firstName = fn;
		lastName = ln;
		age = a;
	}

	public void setFirstName(String newName) {
		firstName = newName;
	}

	public void setLastName(String newName) {
		lastName = newName;
	}

	public String getFullName() {
		String name = firstName + " " + lastName;
		return name;
	}

	public int getAge() {
		return age;
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

