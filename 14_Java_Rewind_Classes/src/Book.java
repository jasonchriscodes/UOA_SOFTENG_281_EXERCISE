
public class Book {

	private String title;
	private String author;
	private int year;
	private double costPrice;
	private double sellPrice;
	private int id;

	private static int nextID = 0;

	public Book(String title, String author, int year, double costPrice, double sellPrice) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.id = nextID;
		nextID++;
	}

	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the costPrice
	 */
	public double getCostPrice() {
		return costPrice;
	}

	/**
	 * @return the sellPrice
	 */
	public double getSellPrice() {
		return sellPrice;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
}
