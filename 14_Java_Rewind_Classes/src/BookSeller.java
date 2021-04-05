
public class BookSeller {
	
	private String name;
	private double balance;
	
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
  
}
