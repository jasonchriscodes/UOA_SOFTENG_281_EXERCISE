public class Student {
  
  private String firstName; // make all Student fields private so that we cannot access them the way he was accessing them
  private String lastName; // in the main() method. As a result, our constructor initialies all the fields.
  private double gpa;
  private String major;
  private int age;
  private boolean onProbation;

  public Student(String firstName, String lastName, double gpa, 
      String major, int age, boolean onProbation) {
    this.firstName = firstName; // 'this' is a reference variable that refers to the current object.
    this.lastName = lastName;
    this.gpa = gpa;
    this.major = major;
    this.age = age;
    this.onProbation = onProbation;
  }

  public void details() {
    System.out.println(this.firstName + " " + this.lastName + " is majoring in " + this.major);
  }

}

