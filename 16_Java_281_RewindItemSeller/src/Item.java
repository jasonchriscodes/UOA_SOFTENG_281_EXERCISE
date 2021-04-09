
public class Item {
	
	protected final String title;
	private final int year;
	private double costPrice;
	private double sellPrice;
	private int itemID;
	private static int nextID = 0;

	public Item(String title, int year, double costPrice, double sellPrice) {
		this.title = title;
		this.year = year;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.itemID = nextID++;
	}

	public String getTitle() {
		return this.title;
	}
	
	public int getYear() {
		return this.year;
	}

	public double getCostPrice() {
		return this.costPrice;
	}

	public double getSellPrice() {
		return this.sellPrice;
	}

	public int getID() {
		return this.itemID;
	}
	
	@Override
	public String toString() {
		return "Item: " + this.title + " (" + this.year + ")";
	}

}
