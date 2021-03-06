import java.util.ArrayList;

public class ItemSeller {

	private String shopName;
	private double cashBalance;
	private ArrayList<Item> collection = new ArrayList<>();
	
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
	
	public void purchaseStock(Item item) {
		cashBalance -= item.getCostPrice();
		collection.add(item);
	}

	public int totalNumberOfItems() {
		return collection.size();
	}
	
//	This is overloading, multiple methods of the same name with different parameters
	public int totalNumberOfItems(Item.Type typeLookingFor) {
		int count = 0;
		
		for (Item item: collection) {
			if (item.getType() == typeLookingFor) {
				count++;
			}
		}
		
		return count;
	}
	
}
