
import java.util.ArrayList;

class Main {

	public static String longestWord(ArrayList<String> words) {
		// TODO complete the code here...

		return null;
	}

	public static void main(String[] args) {
		
		// Test 1
//		ArrayList<String> emptyList = new ArrayList();
//		String result = longestWord(emptyList);
//		System.out.println("Test 1 result: " + result);   // null
//
//		// Test 2
//		ArrayList<String> listWithOneWord = new ArrayList();
//		listWithOneWord.add("apple");
//		result = longestWord(listWithOneWord);
//		System.out.println("Test 2 result: " + result);   // apple

		// Test 3
		ArrayList<String> listWithManyWords = new ArrayList();
		listWithManyWords.add("blue");
		listWithManyWords.add("green");
		listWithManyWords.add("red");
		System.out.println(listWithManyWords.size());
		
		System.out.println(listWithManyWords.get(1));
		
		listWithManyWords.clear();
		System.out.println(listWithManyWords.size());
		
//		result = longestWord(listWithManyWords);
//		System.out.println("Test 3 result: " + result);   // green

		// Test 4
//		ArrayList<String> listWithTies = new ArrayList();
//		listWithTies.add("WhatsApp");
//		listWithTies.add("Zoom");
//		listWithTies.add("Facebook");
//		listWithTies.add("WeChat");
//		listWithTies.add("Skype");
//		result = longestWord(listWithTies);
//		System.out.println("Test 4 result: " + result);  // WhatsApp

	}
}