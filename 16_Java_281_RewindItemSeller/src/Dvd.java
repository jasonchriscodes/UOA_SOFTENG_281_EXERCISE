
public class Dvd extends Item {
	// for the test: why is this is NOT compiling? 1. Is Java trying to insert its own default constructor?
	// it does. 2. Will it answer the default constructor? it will, the empty parameter constructor
	// the empty parent constructor needed before we make a dvd we need to make an item so the empty parameter
	// default constructor in the dvd class is trying to call the default empty parameter constructor of its
	// superclass so there is no such zero parameter constructor in the super class because we've got a different 
	// constructor that takes in parameters and so that is why it fails to create an instance of an item so
	
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
