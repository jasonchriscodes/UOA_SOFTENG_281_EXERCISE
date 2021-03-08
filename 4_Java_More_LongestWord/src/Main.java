
import java.util.ArrayList;

class Main {

	public static String longestWord(ArrayList<String> words) {
		// TODO complete the code here...
		
		if (words.size() == 0) {
			return null;
		}
		
		// make an initial "reasonable assumption" of what is the longest word
		// it is safe to assume there's at least one element because we checked the size above
		String longestWordSoFar = words.get(0); 
		
		// Now we "fix" our assumption by reviewing what's actually in the ArrayList
		for( String currentWord : words ) {
			
			// check if current word is actually longer than what we currently think is longest
			if (currentWord.length() > longestWordSoFar.length()) {
				longestWordSoFar = currentWord;
			}
		}
		
		// return the "best we have found"
		return longestWordSoFar;
	}

	public static void main(String[] args) {
		
		// Test 1
		ArrayList<String> emptyList = new ArrayList();
		String result = longestWord(emptyList);
		System.out.println("Test 1 result: " + result);   // null

		// Test 2
		ArrayList<String> listWithOneWord = new ArrayList();
		listWithOneWord.add("apple");
		result = longestWord(listWithOneWord);
		System.out.println("Test 2 result: " + result);   // apple

		// Test 3
		ArrayList<String> listWithManyWords = new ArrayList();
		listWithManyWords.add("blue");
		listWithManyWords.add("green");
		listWithManyWords.add("red");
		result = longestWord(listWithManyWords);
		System.out.println("Test 3 result: " + result);   // green

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