
public class Main {
	
	public static void main(String[] args) {
		
		int[] numbers = { 2, 4, 3, 5, 6 };
		
		int sum = 0;
		
		for ( int element : numbers ) {
			System.out.println(element);
		}
		
		if (sum > 20) {
			System.out.println("over");
		} else if (sum < 5) {
			System.out.println("under");
		} else {
			System.out.println("Total = " + sum);
		}
		
	}
	
}