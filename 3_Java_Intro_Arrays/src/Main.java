//// Array 1st Activity
//public class Main {
//	
//	public static void sumOfArray() {
//	
//		int[] numbers = {8, 5, 1, 2, 11}; // over
////		int[] numbers = {-8, 5, 1, 2, -11}; // under
////		int[] numbers = {2, 5, 1, 2, 1}; // sum = 11	
//		int sum = 0;
//
//// Choosing between index-based for-loop or for each elements inside numbers style for-loop
//		
//		// index-based for-loop... 
//		// still need this style if you need to know the "index" 
////		for ( int index = 0 ; index < numbers.length ; index++ ) {
////			int element = numbers[index];
////			sum += element;	
////			System.out.println("Element at index " + index + " = " + element);
////		}
//		
//		// for each elements inside numbers style for-loop (nice and elegant when you have collections/arrays)
//		for (int element : numbers) {
//			sum += element;	// shortcut sum = sum + element
//		}
//		
//		if (numbers.length == 0) { // .length is an attribute of an array
//			System.out.println("empty");
//		} else if (sum > 20) {
//			System.out.println("over");
//		} else if (sum < 5) {
//			System.out.println("under");
//		} else {
//			System.out.println("Total = " + sum);
//		}
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("Array 1st Activity");
//		sumOfArray();	
//	}
//}	

// Array 2nd Activity
public class Main {
	
	public static void sumOfArray(int[] numbers) {
	
		int sum = 0;

// Choosing between index-based for-loop or for each elements inside numbers style for-loop
		
		// index-based for-loop... 
		// still need this style if you need to know the "index" 
//		for ( int index = 0 ; index < numbers.length ; index++ ) {
//			int element = numbers[index];
//			sum += element;	
//			System.out.println("Element at index " + index + " = " + element);
//		}
		
		// for each elements inside numbers style for-loop (nice and elegant when you have collections/arrays)
		for (int element : numbers) {
			sum += element;	// shortcut sum = sum + element
		}
		
		if (numbers.length == 0) { // .length is an attribute of an array
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
		System.out.println("Array 2nd Activity");
		
//		// use variable
//		int[] paramToSend = {3, 34, 566, 5,32}; // declare a variable of paramToSend of type in array
//		sumOfArray(paramToSend);
//		System.out.println("The first element in the array is: " + paramToSend[0]); // to print the first variable in the array
		
//		System.out.println("Hello");	// example use of variable to print
//		String paramToSend = "Hello";
//		System.out.println(paramToSend);
		
		sumOfArray(new int[]{}); // u need to tell java this block is a new int array 
		sumOfArray(new int[]{3});
	    sumOfArray(new int[]{23});
	    sumOfArray(new int[]{-5});
	    sumOfArray(new int[]{-3, -2, 1});
	    sumOfArray(new int[]{2, 4, 8, -2, 1});	
	}
}

		
		
  
    
		
