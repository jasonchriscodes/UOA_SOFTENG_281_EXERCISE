import java.util.ArrayList;

public class BookSeller {
	
	private String name;
	private double balance;
	private ArrayList<Book> collection = new ArrayList<>();
	
	public BookSeller(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public Book scanByID(int id) {
		for (Book book: collection) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}
	
	public boolean sellBook(int id) {
		Book bookResult = scanByID(id);
		
		if (bookResult == null) {
			return false;
		}
		
		if (bookResult.isSold()) {
			return false;
		}
		
		balance += bookResult.getSellPrice();
		bookResult.setSold();
		
		return true;
	}
	
	public String getShopName() {
		return this.name;
	}

	public double getCashBalance() {
		return this.balance;
	}
	
	public int totalNumberOfBooks() {
		return collection.size();
	}
	
	public Book searchKeyword(String keyword) {
//		Book searchResult = null;
		
		keyword = keyword.toLowerCase().trim();
		
		for(Book book: collection) {
			String title = book.getTitle().toLowerCase().trim();
			
			if (title.indexOf(keyword) >= 0) {
				return book;
			}
		}
		
		return null;
	}
	
	public int totalNumberOfUnsoldBooks() {
		int countUnsold = 0;
		
		for(Book book: collection) {
			if (!book.isSold()) {
				countUnsold++;
			}
		}
		
		return countUnsold;
	}
	
	public void purchaseStock(Book book) {
		balance -= book.getCostPrice();
		
		collection.add(book);
	}
  
}
