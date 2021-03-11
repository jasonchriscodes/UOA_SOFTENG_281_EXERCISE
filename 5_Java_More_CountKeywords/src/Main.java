
import java.util.ArrayList;

class Main {

	public static int countKeywords(String keywords) {
		
		// make assumption like in the last activity
		int numberOfWordsFound = 0;
		
		// split the string
		String[] brokenParts = keywords.split(";"); // .split is to split string around matches of the given regular expression.
		
		for (String part: brokenParts) { // example 1st part means the first keywords
			String cleanedPart = part.trim(); // .trim returns a copy of the string, with leading and trailing WHITESPACE OMITTED.
//			System.out.println(cleanedPart);

			// update our assumption.. 
			if (cleanedPart.length() > 0) { // > 0 omit the empty string
				numberOfWordsFound++;
			}
		}
		
		// return our assumption
		return numberOfWordsFound;
	}

	public static void main(String[] args) {

		// Test 1
		String test1 = "";
		int result = countKeywords(test1);
		System.out.println("Test 1 result: " + result);   // expect 0

		// Test 2
		String test2 = "fruit; vegetables; drinks";
		result = countKeywords(test2);
		System.out.println("Test 2 result: " + result);   // expect 3

		// Test 3
		String test3 = "flat white; latte; cappuccino; cafe au lait; mocha";
		result = countKeywords(test3);
		System.out.println("Test 3 result: " + result);   // expect 5

		// Test 4
		String test4 = "oolong; ; herbal;  ;;    ; matcha";
		result = countKeywords(test4);
		System.out.println("Test 4 result: " + result);   // expect 3

		// Test 5
		String test5 = ";hoki;;";
		result = countKeywords(test5);
		System.out.println("Test 5 result: " + result);   // expect 1

	}
}