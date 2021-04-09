
public class Book {

	private final String title;
	private final String author;
	private final int yearPublished;
	private double costPrice;
	private double sellPrice;

	private int bookID;
	private static int nextID = 0;

	public Book(String title, String author, int yearPublished, double costPrice, double sellPrice) {
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.bookID = nextID++;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getYearPublished() {
		return this.yearPublished;
	}

	public double getCostPrice() {
		return this.costPrice;
	}

	public double getSellPrice() {
		return this.sellPrice;
	}

	public int getID() {
		return this.bookID;
	}

}
