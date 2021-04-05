import java.util.Objects;

public class Book {

	private String title;
	private String author;
	private int year;
	private double costPrice;
	private double sellPrice;
	
	// Integer.MAX_VALUE return the number of highest integer inside int
	private static int oldestYear = Integer.MAX_VALUE;
	
	// implement a method public static int getOldestBookYear() inside Book
	public static int getOldestBookYear() {
		return oldestYear;
	}
	
	// Object o; // to see public class object method, block Object right click Open type hierarchy
	
	// define equality for Book by overriding the public boolean equals(Object obj) method
	// equality of books depends on the title, author, and year
	// strictly speaking, you should also override the public int hashCode() method
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

	// need to initialized for static field
	private static int nextID = 0;

	// implement a Book constructor that expects:
	public Book(String title, String author, int year, double costPrice, double sellPrice) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.sold = false;
		// assign a unique ID to the book when it is constructed, using a static variable.
		this.id = nextID; // or this.id = nextID++; (after set to id, then increment / pre - increment), 
		                  // but can NOT do this.id = ++nextID; (increment, then set to id / post - increment)
		nextID++; // or ++nextID, java read it one by line so it does not matter
		
		
		// It will return the year of the oldest book that exists. You will need to also make changes to 
		// your Book constructor (e.g. to figure out if the book instance constructed is older than the current oldest book)
		if (year < oldestYear) {
			oldestYear = year;
		}
		
	}
	
	// implement a method public void reduceSellPrice(double deltaAmount) inside Book
	public void reduceSellPrice(double deltaAmount) {
		// it reduces the sell price of a particular book instance by (at most) the specified deltaAmount
		this.sellPrice -= deltaAmount;
		
		// however, the book seller never wants to sell a book below cost! 
		// so you need to make sure the sell price never drops below its cost price!
		// if the deltaAmount causes the sell price to drop below the cost price, 
		// then make the sell price equal to the cost price.
		if (this.sellPrice < this.costPrice) {
			this.sellPrice = this.costPrice;
		}
	}
	
	/**
	 * @return the sold
	 */
	// add a sold status to Book, with its respective getter (public boolean isSold())
	public boolean isSold() {
		return this.sold;
	}

	/**
	 * @param sold the sold to set
	 */
	// add a sold status to Book, with its respective setter (public void sell())
	public void setSold() {
		this.sold = true;
	}

	// use overrride to let the compiler check the mistype for overriding toString() method
	// otherwise the compiler will add toStrings() method but it did not overriding toString() method
	// so it will give a rubbish default implementation
	@Override
    public String toString() {
		return this.title + " by " + this.author + " (" + this.year + ") has ID " + this.id; // not nextID, it's a static field that they share
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
	// set getter only instead of setter because the author name is fix
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
	// set getter only instead of setter for cost price because does not make sense to set the cost price after 
	// you've already got the book instance cost price is not gonna change
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
	// add a getID() method for the Book class.
	public int getId() {
		return id;
	}
	
}
