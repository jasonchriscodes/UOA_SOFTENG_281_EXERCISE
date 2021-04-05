
class Main {

  public static void main(String[] args) {
    BookSeller shop = new BookSeller("Books r Us", 100); 
    
    System.out.println("Starting balance for " + shop.getShopName() + " is: " + shop.getCashBalance()); 
    System.out.println();
    
  }

}