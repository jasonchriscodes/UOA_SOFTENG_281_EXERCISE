class Main {

  public static void printStatus(String message) { // use static void because there are 2 static method
    System.out.println(message + ":"); 			// ,only can fill with static field or method
    System.out.println("Population = " + Person.getPopulation()); 
    System.out.println("Oldest age = " + Person.getOldestAge() 
      + " (" + Person.getOldestPerson() + ")");   
  }

  public static void main(String[] args) {

    printStatus("Before creating Jenny");

    Person jenny = new Person("Jenny", "Jones", 20);
    printStatus("After creating Jenny, before creating Bob");

    Person bob = new Person("Bob", "Jones", 18);    
    printStatus("After creating Bob, before Bob's birthday");

    bob.birthday();
    printStatus("After Bob's first birthday");

    bob.birthday();
    printStatus("After Bob's second birthday");

    bob.birthday();
    printStatus("After Bob's third birthday");
  }
}