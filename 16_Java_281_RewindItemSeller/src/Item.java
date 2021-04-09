
public abstract class Item {
	
	public enum Type {BOOK, DVD}
	
	protected final String title;
	protected final int year;
	protected double costPrice;
	protected double sellPrice;
	protected int itemID;
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
	
	public abstract Type getType();

}
