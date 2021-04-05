import java.util.ArrayList;

public class BookSeller {
	
	private String name;
	private double balance;
	private ArrayList<Book> collection = new ArrayList<>();
	
	public BookSeller(String name, double balance) {
		this.name = name;
		this.balance = balance;
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
	
	public void purchaseStock(Book book) {
		balance -= book.getCostPrice();
		
		collection.add(book);
	}
  
}
