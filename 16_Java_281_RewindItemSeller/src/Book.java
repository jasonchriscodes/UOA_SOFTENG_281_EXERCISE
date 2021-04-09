
public class Book extends Item {

	private final String author;

	public Book(String title, String author, int yearPublished, double costPrice, double sellPrice) {
		super(title, yearPublished, costPrice, sellPrice);
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}
	
	@Override
	public String toString() {
		return "Book " + super.toString() + " " + this.author;
	}

}
