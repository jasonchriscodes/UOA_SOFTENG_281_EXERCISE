import java.util.Objects;

public class Book {

	private String title;
	private String author;
	private int year;
	private double costPrice;
	private double sellPrice;
	
	@Override
	public int hashCode() {
		return Objects.hash(author, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
	}

	private int id;
	
	private boolean sold;

	private static int nextID = 0;

	public Book(String title, String author, int year, double costPrice, double sellPrice) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.sold = false;
		this.id = nextID;
		nextID++;
	}
	
	public void reduceSellPrice(double deltaAmount) {
		this.sellPrice -= deltaAmount;
		
		if (this.sellPrice < this.costPrice) {
			this.sellPrice = this.costPrice;
		}
	}
	
	/**
	 * @return the sold
	 */
	public boolean isSold() {
		return this.sold;
	}

	/**
	 * @param sold the sold to set
	 */
	public void setSold() {
		this.sold = true;
	}

	@Override
    public String toString() {
		return this.title + " by " + this.author + " (" + this.year + ") has ID " + this.id;
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
