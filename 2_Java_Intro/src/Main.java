
public class Main {
	public static void sumOfTwoNumbers(int first, int second) {

		int sum = first + second; // u can type 'se' + cntrl + space to write shortcut of second 

		if (sum > 10) {
			System.out.println("over"); // System is a public class, out is a public field, println is a public method
		} else if (sum < 0) {
			System.out.println("under"); // curly braces is optional when there is only one statement
		} else {
			System.out.println("Total = " + sum); // use sysout + cntrl + space to shortcut System.out.println
		}
	}

	public static void main(String[] args) { // the method (main) should be same as class (Main), Otherwise it will not run
		sumOfTwoNumbers(23, 5); // call method from above
		sumOfTwoNumbers(-2, -74);
		sumOfTwoNumbers(3, 4);
	}
}