// ArrayList is a collection type of variable
import java.util.ArrayList; // need to import if use ArrayList

class Main {

	public static String longestWord(ArrayList<String> words) { // take Arraylist of String and return String represent the 
																// longest word inside that list
																// in java arrays is more powerful & more methods such as 
                                                                // u do not pre-define the length of the array
		
		if (words.size() == 0) { // can use words.isEmpty()
			return null; // null mean nothing, "" mean STRING that has nothing
		}
		
		// make an initial "reasonable assumption" of what is the longest word
		// it is safe to assume there's at least one element because we checked the size above
		String longestWordSoFar = words.get(0); // we can use "", means there is at least 1 element 
		
		// Now we "fix" our assumption by reviewing what's actually in the ArrayList
		for(String currentWord : words) {
			
			// check if current word is actually longer than what we currently think is longest
			if (currentWord.length() > longestWordSoFar.length()) {
				longestWordSoFar = currentWord;
			}
		}
		
		// return the "best we have found"
		return longestWordSoFar;
	}

	public static void main(String[] args) {
		
		String message = "Hello how are you?";
		System.out.println(message.toUpperCase()); // return HELLO HOW ARE YOU?
		System.out.println(message.toLowerCase()); // return hello how are you?
		System.out.println(message.length()); // return 18
//		String substring(int beginIndex);
		String res = message.substring(3, 5);
		System.out.println(res); // return 'lo'
		
		// Test 1
		ArrayList<String> emptyList = new ArrayList();
		String result = longestWord(emptyList);
		System.out.println("Test 1 result: " + result);   // result is null when ArrayList is empty

		// Test 2
		ArrayList<String> listWithOneWord = new ArrayList();
		listWithOneWord.add("apple");
		result = longestWord(listWithOneWord);
		System.out.println("Test 2 result: " + result);   // apple

		// Test 3
		ArrayList<String> listWithManyWords = new ArrayList();
//		System.out.println(listWithManyWords.size()); // check number of elements in listWithManyWords, return 0
		listWithManyWords.add("blue"); // add 1 String in listWithManyWords and the 1st element value is blue, 
//		System.out.println(listWithManyWords.size()); // check number of elements in listWithManyWords, return 1
		listWithManyWords.add("green");
//		System.out.println(listWithManyWords.size()); // check number of elements in listWithManyWords, return 2
		listWithManyWords.add("red");
//		System.out.println(listWithManyWords.size()); // check number of elements in listWithManyWords, return 3
		result = longestWord(listWithManyWords);
		System.out.println("Test 3 result: " + result);   // green
		System.out.println(listWithManyWords.get(1)); // return green
		
//		listWithManyWords.clear();
//		System.out.println(listWithManyWords.size()); // check number of elements in listWithManyWords, return 0 cus erased by .clear method
		
		// Test 4
		ArrayList<String> listWithTies = new ArrayList();
		listWithTies.add("WhatsApp");
		listWithTies.add("Zoom");
		listWithTies.add("Facebook");
		listWithTies.add("WeChat");
		listWithTies.add("Skype");
		result = longestWord(listWithTies);
		System.out.println("Test 4 result: " + result);  // WhatsApp
	}
}