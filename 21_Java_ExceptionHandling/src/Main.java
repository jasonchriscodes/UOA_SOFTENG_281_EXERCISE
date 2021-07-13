import java.io.FileReader;
import java.io.BufferedReader;

class Main {
	public static void main(String[] args) {
		FileReader fileReader = new FileReader("to_be_read.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		fileReader.close();
	}
}