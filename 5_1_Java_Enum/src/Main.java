class Main {

  // public enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

  static final int MONDAY=0, TUESDAY=1, WEDNESDAY=2, THURSDAY=3, FRIDAY=4, SATURDAY=5, SUNDAY=6;

  public static void main(String[] args) {
    
    int dayToCheck = SUNDAY;

    if (dayToCheck == MONDAY) {
        System.out.println("MONDAY is a weekday!");
    } else if (dayToCheck == TUESDAY) {
        System.out.println("TUESDAY is a weekday!");
    } else if (dayToCheck == WEDNESDAY) {
        System.out.println("WEDNESDAY is a weekday!");
    } else if (dayToCheck == THURSDAY) {
        System.out.println("THURSDAY is a weekday!");
    } else if (dayToCheck == FRIDAY) {
        System.out.println("FRIDAY is a weekday!");
    } else if (dayToCheck == SATURDAY) {
        System.out.println("SATURDAY is a weekend!");
    } else if (dayToCheck == SUNDAY) {
        System.out.println("SUNDAY is a weekend!");
    } else {
        System.out.println("Uh oh! We have more than 7 possible days of the week!");
    } 

  }
}