
public class Main { 

	public static void main(String[] args) {

		ItemSeller shop = new ItemSeller("Items 'r' Us", 100.0); 
		System.out.println("Starting balance: $" + shop.getCashBalance()); 
		System.out.println();

		Book harryPotter = new Book("Harry Potter Philosopher Stone", "J. K. Rowling", 1997, 10.50, 29.95); // ID: 0
		shop.purchaseStock(harryPotter); 

		System.out.println("Balance after purchasing stock: $" + shop.getCashBalance());

	}

}
