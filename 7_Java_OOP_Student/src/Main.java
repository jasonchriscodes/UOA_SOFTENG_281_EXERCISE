class Main { // class must match the .java file
  public static void main(String[] args) {
    
    Student myStudent = new Student("Jim", "Halpert", 2.3, "Business", 24, false);

    Student myStudent2 = new Student("Pam", "Beasley", 2.5, "Art", 23, true);
    
    myStudent.details(); // call detail() method
    
    myStudent2.details();
    
    myStudent.firstName = "Jim"; // we get error message because we set firstName attribute on Student Class as private
    System.out.println(myStudent.firstName);// not a public

  }
}