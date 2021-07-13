//import java.io.FileReader;
//import java.io.BufferedReader;

class Main {
	
	public static void foo(String name) throws IDontLikeYouException {
		System.out.println("inside foo before");
		bar(name);
		System.out.println("inside foo after");
	}
	
	private static void bar(String name) throws IDontLikeYouException {
		System.out.println("inside bar before");
		if (name.toLowerCase().equals("nasser")) {
//			System.out.println("I don't like you Nasser, that's what I didn't come to your class today and instead studied for ENGSCI 211. I should have failed ENGSCI 211 to show how much I appreciate you.");
			throw new IDontLikeYouException("I don't like Nasser");
		} else if (name.toLowerCase().equals("bob")) {
//			System.out.println("I don't like you Nasser, that's what I didn't come to your class today and instead studied for ENGSCI 211. I should have failed ENGSCI 211 to show how much I appreciate you.");
			throw new IDontLikeYouException("I don't like Bob");
		}
		System.out.println("Hello, " + name);
		System.out.println("inside bar after");
	}

	public static void main(String[] args) {
		
//		try {
//			foo("August");
			foo("Bob");
//			foo("NasSer");
//		} catch(IDontLikeYouException e) {
//			System.out.println("I caught it! I caught it: " + e.getMessage());
//		}
		System.out.println("All good, program completes...");
		
//		FileReader fileReader = new FileReader("to_be_read.txt");
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		String line;
//		while ((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
//		fileReader.close();
	}
}