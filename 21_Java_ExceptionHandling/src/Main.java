//import java.io.FileReader;
//import java.io.BufferedReader;

class Main {
	
	public static void foo(String name) {
		System.out.println("inside foo before");
		bar(name);
		System.out.println("inside foo after");
	}
	
	private static void bar(String name) {
		System.out.println("inside bar before");
		if (name.toLowerCase().equals("nasser")) {
			System.out.println("I don't like you Nasser, that's what I didn't come to your class today and instead studied for ENGSCI 211. I should have failed ENGSCI 211 to show how much I appreciate you.");
		}
		System.out.println("Hello, " + name);
		System.out.println("inside bar after");
	}

	public static void main(String[] args) {
//		foo("August");
		foo("NasSer");
		
		
//		FileReader fileReader = new FileReader("to_be_read.txt");
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		String line;
//		while ((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
//		fileReader.close();
	}
}