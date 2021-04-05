
class Main {
	

  private static void prettyPrintShopDetails(BookSeller shop, String message) {
	    System.out.print(message + shop.getShopName() + " has balance of : " + shop.getCashBalance()); 
	    System.out.println(" and has " + shop.totalNumberOfUnsoldBooks() + " unsold books in stock");
	    System.out.println();
  }

  public static void main(String[] args) {
    BookSeller shop = new BookSeller("Books r Us", 100); 
    
//    prettyPrintShopDetails(shop, "Starting balance ");
    
 // Create a few Book instances
    Book hp1 = new Book("Harry Potter Philosopher Stone", "J. K. Rowling", 1997, 10.50, 29.95); // ID: 0
    Book hp2a = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 11.50, 31.95);  // ID: 1
    Book hp2b = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 9.50, 31.95);   // ID: 2
    Book phil = new Book("Philosophy 101", "Paul Kleinman", 2013, 8.75, 15.99);                 // ID: 3

    shop.purchaseStock(hp1);

//    prettyPrintShopDetails(shop, "After purchase 1 book ");
    shop.purchaseStock(hp2a);
//    prettyPrintShopDetails(shop, "After purchase 2 books ");
    shop.purchaseStock(hp2b);
//    prettyPrintShopDetails(shop, "After purchase 3 books ");
    shop.purchaseStock(phil);
//    prettyPrintShopDetails(shop, "After purchase 4 books "); 
    
    System.out.println(hp1.toString());
    System.out.println(hp2a.toString());
    System.out.println(hp2b.toString());
    System.out.println(phil.toString());
    System.out.println();
    

    Book bookFound = shop.searchKeyword("  seCreTs  ");
//    Book bookFound = shop.scanByID(2);
    
    
    
    if (bookFound == null) {
    	System.out.println("Couldn't find this book!");
    } else {
    	System.out.println("Found " + bookFound);
    	
    	bookFound.reduceSellPrice(2000);
//    	bookFound.sellPrice -= 2000;

    	prettyPrintShopDetails(shop, "Before selling book... ");
    	
    	int numSold = shop.sellAllCopiesOfBook(bookFound);
    	System.out.println("Sold: " + numSold);
    	
//    	boolean  successs = shop.sellBook(bookFound.getId()););
//    	if (successs) {
//    		System.out.println("SOLD!");
//    	} else {
//    		System.out.println("ALready SOLD!");
//    	}
    	prettyPrintShopDetails(shop, "After selling book...");
    }
    
  }

}