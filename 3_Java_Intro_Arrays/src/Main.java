
public class Main {
	
	public static void sumOfArray(int[] numbers) {
		
//		int[] numbers = { 2, 3, 4, 34, 2, 34 , 3 };
		
		int sum = 0;
		
		// index-based for-loop... 
		// still need this style if you need to know the "index" 
//		for ( int index = 0 ; index < numbers.length ; index++ ) {
//			int element = numbers[index];
//			sum += element;	
//			System.out.println("Element at index " + index + " = " + element);
//		}
		
		// foreach style for-loop (nice and elegant when you have collections/arrays)
		for ( int element : numbers ) {
			sum += element;		 
		}
		
		if (numbers.length == 0) {
			System.out.println("empty");
		} else if (sum > 20) {
			System.out.println("over");
		} else if (sum < 5) {
			System.out.println("under");
		} else {
			System.out.println("Total = " + sum);
		}
	}
	
	public static void main(String[] args) {
		sumOfArray(new int[]{});
	    sumOfArray(new int[]{3});
	    sumOfArray(new int[]{23});
	    sumOfArray(new int[]{-5});
	    sumOfArray(new int[]{-3, -2, 1});
	    sumOfArray(new int[]{2, 4, 8, -2, 1});		
	}
	
}