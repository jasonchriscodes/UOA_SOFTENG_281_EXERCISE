
class Main {
	
  // use static method because static method in the main static can only call static method
  private static void prettyPrintShopDetails(BookSeller shop, String message) {
	    System.out.print(message + shop.getShopName() + " has balance of : " + shop.getCashBalance()); 
	    System.out.println(" and has " + shop.totalNumberOfUnsoldBooks() + " unsold books in stock");
	    System.out.println();
  }

  public static void main(String[] args) {
	// create an instance of BookSeller and print its starting cash balance as in the Example
    BookSeller shop = new BookSeller("Books r Us", 100); 
    
//  prettyPrintShopDetails(shop, "Starting balance ");
    
    // Create a few Book instances
    Book hp1 = new Book("Harry Potter Philosopher Stone", "J. K. Rowling", 1997, 10.50, 29.95); // ID: 0
    Book hp2a = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 11.50, 31.95);  // ID: 1
    Book hp2b = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 9.50, 31.95);   // ID: 2
    Book phil = new Book("Philosophy 101", "Paul Kleinman", 1013, 8.75, 15.99);                 // ID: 3
    
    // test that each book instance has a unique ID returned.
    // System.out.println(hp1.getId());

    // purchase book
    shop.purchaseStock(hp1);
    // prettyPrintShopDetails(shop, "After purchase 1 book ");
    shop.purchaseStock(hp2a);
    // prettyPrintShopDetails(shop, "After purchase 2 books ");
    shop.purchaseStock(hp2b);
    // prettyPrintShopDetails(shop, "After purchase 3 books ");
    shop.purchaseStock(phil);
    // prettyPrintShopDetails(shop, "After purchase 4 books "); 
    
    // override the public String toString() method for the Book class and test it by calling it on 
    // the Book instances you made above.
    System.out.println(hp1.toString()); // or System.out.println(hp1), only for toString() method
    System.out.println(hp2a.toString()); // or System.out.println(hp2a), only for toString() method
    System.out.println(hp2b.toString()); // or System.out.println(hp2b), only for toString() method
    System.out.println(phil.toString()); // or System.out.println(phil), only for toString() method
    System.out.println();
    

    Book bookFound = shop.searchKeyword("  seCreTs  ");
    // implement a method public Book scanByID(int id) inside BookSeller and test it by retrieving 
    // existing/missing books in the collection
//    Book bookFound = shop.scanByID(2); // check book by scan by id 
    
    if (bookFound == null) {
    	System.out.println("Couldn't find this book!");
    } else {
    	System.out.println("Found " + bookFound);
    	
    	// appreciate why we would want fields to be private! It allows us to safeguard the state of our instance 
    	// (in this case, to ensure that the sell price doesn’t change to something too low!
    	bookFound.reduceSellPrice(2000);
//    	bookFound.sellPrice -= 2000;

    	prettyPrintShopDetails(shop, "Before selling book... ");
    
    	int numSold = shop.sellAllCopiesOfBook(bookFound);
    	System.out.println("Sold: " + numSold);
    	
//    	shop.sellBook(bookFound.getId()); // check the book condition b4 and after selling 
//    	OR
//    	boolean successs = shop.sellBook(bookFound.getId()););
//    	if (successs) {
//    		System.out.println("SOLD!");
//    	} else {
//    		System.out.println("ALready SOLD!");
//    	}
    	
    	prettyPrintShopDetails(shop, "After selling book...");

        
        System.out.println("Oldest Book Year is " + Book.getOldestBookYear());
        
    }
    
  }

}