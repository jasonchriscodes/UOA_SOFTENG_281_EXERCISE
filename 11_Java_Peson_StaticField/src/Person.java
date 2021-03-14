
public class Person {

  // instance fields
  private String firstName;
  private String lastName;
  private int age;
  private int id;

  // static field
  private static int nextID = 0;

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.id = nextID;
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

  public void introduceSelf() {
    System.out.println("Hello, my name is " + firstName + 
      ", I am " + age + " years old, and my ID number is " + id);
  }

}

