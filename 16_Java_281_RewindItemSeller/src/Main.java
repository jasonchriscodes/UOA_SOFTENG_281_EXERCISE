
public class Main { 

	public static void main(String[] args) {

		ItemSeller shop = new ItemSeller("Items 'r' Us", 100.0); 
		System.out.println("Starting balance: $" + shop.getCashBalance()); 
		System.out.println();

		Book harryPotter = new Book("Harry Potter Philosopher Stone", "J. K. Rowling", 1997, 10.50, 29.95); // ID: 0
		Dvd shawshank = new Dvd("The Shawshank Redemption", "Frank Darabont", 1994, 8, 22.95);              // ID: 1
		// this is declared of type item (variable type item), but it still a dvd  
		Item godFather = new Dvd("The Godfather", "Francis Ford Coppola", 1972, 11, 29.95);                 // ID: 2
		
//		System.out.println("Before changing address");
//		shop.purchaseStock(harryPotter);
//		shop.purchaseStock(shawshank);
//		shop.purchaseStock(godFather); 
		
		// can later on be updated to a different item, so the godFather initially refer to the address of 
		// the dvd but now the address is refer to harry potter (become book type not dvd anymore) 
		godFather = harryPotter;
		
		System.out.println("After changing address");
		shop.purchaseStock(harryPotter);
		shop.purchaseStock(shawshank);
		shop.purchaseStock(godFather); 
		
//		System.out.println("Purchased: " + harryPotter);
		
//		System.out.println(" type = " + harryPotter.getType()); // print out the type of harryPotter

		System.out.println("Balance after purchasing stock: $" + shop.getCashBalance());

		System.out.println("Total number of items = " + shop.totalNumberOfItems());
		// count no of book bought
		System.out.println("Total number of books = " + shop.totalNumberOfItems(Item.Type.BOOK));
		// count no of DVDs bought
		System.out.println("Total number of DVDs = " + shop.totalNumberOfItems(Item.Type.DVD));

	}

}
