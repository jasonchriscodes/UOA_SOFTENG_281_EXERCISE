
public class Dvd extends Item {
	
	private final String director;

	public Dvd(String title, String director, int year, double costPrice, double sellPrice) {
		super(title, year, costPrice, sellPrice);
		this.director = director;
	}
	
	public String getDirector() {
		return director;
	}

	@Override
	public Item.Type getType() {
		return Type.DVD;
	}
	
}
