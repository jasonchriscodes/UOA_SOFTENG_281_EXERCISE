import java.util.ArrayList;

public class BookSeller {
	
	private String name;
	private double balance;
	// initialized empty array list, different from null (does not exist)
	// Declare a private ArrayList<Book> collection field
	private ArrayList<Book> collection = new ArrayList<>(); 
	
	// empty parameter constructor
	public BookSeller() {
		this.name = "Unnamed";
		this.balance = 0;
	}
	
	// declare and define a BookSeller constructor public BookSeller(String shopName, double initialBalance).
	// default constructor
	public BookSeller(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public Book scanByID(int id) {
		// loop through each book in the collection. If a book’s ID matches the id we want, return the book
		for (Book book: collection) {
			if (book.getId() == id) {
				return book;
			}
		}
		// if a book with that id wasn’t found, return null
		return null;
	}
	
	public boolean sellBook(int id) {
		// reuse the scanByID() method to find the Book
		Book bookResult = scanByID(id);
		
		// if no book was found in the scan, then return false from sellBook()
		if (bookResult == null) {
			return false;
		}
		
		// for the retrieved book, check it isn’t already sold
		// if it is already sold, return false from sellBook()
		// add a sold status to Book, with its respective setter (public void sell()) and getter (public boolean isSold())
		// if the book has been sold it can NOT be sold again so its return false
		if (bookResult.isSold()) {
			return false;
		}
		
		// otherwise, update its status to sold, update the BookSeller’s cash balance, and return true from sellBook()
		// if the book is sold
		balance += bookResult.getSellPrice();
		bookResult.setSold();
		
		return true;
	}
	
	// implement a method public int sellAllCopiesOfBook(Book bookToSell) inside BookSeller
	public int sellAllCopiesOfBook(Book bookToSell) {
		// inside sellAllCopiesOfBook(), define a count for the number of copies (initially set to zero)
		int count = 0;
		
		// for each “equal book” in the collection, attempt to sell it using the existing sellBook() method
		for (Book book: collection) {
			// check if it was successful (according to the returned value sellBook()). If so, increment the count
			if (book.equals(bookToSell)) {
				
				boolean soldSuccessfully = sellBook(book.getId());
				if (soldSuccessfully) {
					count++;
				}
				
			}
		}
		
		// finally, return the count
		return count;
	}
	
	// getter shop name
	public String getShopName() {
		return this.name;
	}

	// declare and define a getter method public double getCashBalance().
	// getter balance
	public double getCashBalance() {
		return this.balance;
	}
	
	// public int totalNumberOfBooks() inside BookSeller
	public int totalNumberOfBooks() {
		return collection.size();
	}
	
	// implement a method public Book searchKeyword(String keyword) inside BookSeller
	public Book searchKeyword(String keyword) {
//		Book searchResult = null;
		
		// clean keyword uppercase, lower case, space
		keyword = keyword.toLowerCase().trim();
		
		// loop through the collection. If the keyword is in the title, return the book. Otherwise return null
		for(Book book: collection) {
			String title = book.getTitle().toLowerCase().trim();
			
			// if the keyword is the subset of title
			if (title.contains(keyword)) {
				return book;
			}
		}
		
		return null;
	}
	
	// implement a method public int totalNumberOfUnsoldBooks() inside BookSeller
	public int totalNumberOfUnsoldBooks() {
		int countUnsold = 0;
		
		// loop through all books and count how many books aren’t sold yet. Return that count
		for(Book book: collection) {
			if (!book.isSold()) {
				countUnsold++;
			}
		}
		
		return countUnsold;
	}
	
	public void purchaseStock(Book book) {
		// decrement the book seller’s cash balance (will need to add a getCostPrice() instance method for Book).
		balance -= book.getCostPrice();
		
		// make use of the add() method on the ArrayList.
		// add book to collection
		collection.add(book);
	}
  
}
