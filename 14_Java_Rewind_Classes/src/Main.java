
class Main {

  public static void main(String[] args) {
    BookSeller shop = new BookSeller("Books r Us", 100); 
    
    System.out.println("Starting balance for " + shop.getShopName() + " is: " + shop.getCashBalance()); 
    System.out.println();
    
 // Create a few Book instances
    Book hp1 = new Book("Harry Potter Philosopher Stone", "J. K. Rowling", 1997, 10.50, 29.95); // ID: 0
    Book hp2a = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 11.50, 31.95);  // ID: 1
    Book hp2b = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 9.50, 31.95);   // ID: 2
    Book phil = new Book("Philosophy 101", "Paul Kleinman", 2013, 8.75, 15.99);                 // ID: 3
    
    
  }

}