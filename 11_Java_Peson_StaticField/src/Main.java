class Main {
  public static void main(String[] args) {

    Person jenny = new Person("Jenny", "Jones", 20);
    Person bob = new Person("Bob", "Jones", 18);    

    System.out.println("Jenny's ID = " + jenny.getID());   
    System.out.println("Bob's ID = " + bob.getID());   

    jenny.introduceSelf();
    bob.introduceSelf();
  }
}