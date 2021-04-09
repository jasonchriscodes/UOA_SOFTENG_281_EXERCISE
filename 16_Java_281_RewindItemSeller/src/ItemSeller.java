import java.util.ArrayList;

public class ItemSeller {

	private String shopName;
	private double cashBalance;
	private ArrayList<Book> collection = new ArrayList<>();
	
	public ItemSeller(String shopName, double initialBalance) {
		this.shopName = shopName;
		this.cashBalance = initialBalance;
	}

	public String getShopName() {
		return this.shopName;
	}

	public double getCashBalance() {
		return this.cashBalance;
	}
	
	public void purchaseStock(Book book) {
		cashBalance -= book.getCostPrice();
		collection.add(book);
	}
	
	public int totalNumberOfBooks() {
		return collection.size();
	}
	
}
