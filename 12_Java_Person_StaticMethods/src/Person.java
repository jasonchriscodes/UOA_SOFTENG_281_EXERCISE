
public class Person {

  // instance fields
  private String firstName;
  private String lastName;
  private int age;
  private int id;

  // static fields, is use if method depend on a general instance not a particular instance
  private static int nextID = 0;
  private static int oldestAge = 0;
  private static String oldestPerson = "N/A";

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.id = nextID;
    nextID++;

    if (age > oldestAge) {
      oldestAge = age;
      oldestPerson = firstName;
    }
  }

  // static method, they can operate without requiring an instance.
  // inside static method can't access any non-static fields & methods
  public static int getPopulation() {
    return nextID;
  }

  // static method
  public static int getOldestAge() {
    return oldestAge;
  }

  // static method
  public static String getOldestPerson() {
    return oldestPerson;
  }

  // instance method
  public String getFullName() {
    String name = firstName + " " + lastName;
    return name;
  }

  // instance method
  public int getAge() {
    return age;
  }

  // instance method
  public int getID() {
    return id;
  }

  // instance method
  public void birthday() {
    age++;
    System.out.println("Happy Birthday " + firstName + "!");

    if (age > oldestAge) { // inside the instance method we are still allowed to access the static field
      oldestAge = age;
      oldestPerson = firstName;
    }
  }

  // instance method
  public void introduceSelf() {
    System.out.println("Hello, my name is " + firstName + 
      ", I am " + age + " years old, and my ID number is " + id);
  }

}

