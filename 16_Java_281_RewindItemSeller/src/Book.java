
public class Book extends Item {

	private final String author; // the word 'final' use because the year, title, author is not gonna change
								 // if we accidentally change or delete the name of the title of a book 
	                             // the compiler will complaint such as prevent use a setter to change 
	                             // the author, try this by comment out return this.author
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
	
	@Override
	public Item.Type getType() {
		return Type.BOOK;
	}

}
