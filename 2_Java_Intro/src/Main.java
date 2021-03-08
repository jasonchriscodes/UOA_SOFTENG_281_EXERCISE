
public class Main {
	public static void sumOfTwoNumbers(int first, int second) {

		int sum = first + second;
		
		if (sum > 10) {
			System.out.println("over");
		} else if (sum < 0) {
			System.out.println("under");
		} else {
			System.out.println("Total = " + sum);
		}
	}
	
	public static void main(String[] args) {
		sumOfTwoNumbers(23, 5);
		sumOfTwoNumbers(-2, -74);
		sumOfTwoNumbers(3, 4);
	}
	
}