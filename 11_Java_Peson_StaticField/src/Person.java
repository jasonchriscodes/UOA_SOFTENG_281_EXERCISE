
public class Person {

  // instance fields
  private String firstName;
  private String lastName;
  private int age;
  private int id;

  // static field
  private static int nextID = 0;

  // as soon as this constructor is introduced, the default parameter does not exist anymore because the constructor 
  // with 3 parameter overwritten the default constructor (Person bob = new Person() unless u explicitly made a 
  // new constructor with no parameter)
  public Person(String firstName, String lastName, int age) { 
    this.firstName = firstName;  
    this.lastName = lastName;
    this.age = age;
    this.id = nextID; // nextID from static field, if static field did not apply the value will be reseted
    nextID++;
  }

  public String getFullName() {
    String name = firstName + " " + lastName;
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getID() {
    return id;
  }

  public void birthday() {
    age++;
    System.out.println("Happy Birthday " + firstName + "!");
  }

  public void introduceSelf() { // instance method
    System.out.println("Hello, my name is " + firstName + 
      ", I am " + age + " years old, and my ID number is " + id);
  }

}

