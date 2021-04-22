
public class Colour {
	private String name;
	private int red;
	private int green;
	private int blue;

	public Colour(String name, int red, int green, int blue) {
		this.name = name;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	@Override // show that this method overriding the one that is default for object (optional but good habit)
	// instance method, Object in (Object obj) is an object class
	public boolean equals(Object obj) { 
		// exact same instance?
		// check for identity, address of this instance == the address of the other object
		// for example bob.equaljenny, bob become this and jenny become the other object	
		if (this == obj) { 
			return true;
		}

		// is the other reference null?
		// this is checking if the other object is null, bob.equalsnul or bob.equalsjenny when jenny 
		// has not been assigned an instance so jenny equal null previously, this instance per se cannot be
		// null otherwise we would not be inside this method in the first place, we would get null pointer 
		// exception before we got the equals method
		if (obj == null) {
			return false;
		}

		// same class type?
		// check what type of this instance, every type that is not a primitive type is a class type
		Class typeOfThisInstance = this.getClass();
		Class typeOfOtherInstance = obj.getClass();
		if (typeOfThisInstance != typeOfOtherInstance) {
			return false;
		}

		// Otherwise, they are the same types, so cast the Object to Colour
		// so now the obj is also a colour type, other is a colour instance
		Colour other = (Colour) obj;

		// Do the attributes we care about have the same values?
		boolean sameRed = this.red == other.red;
		boolean sameGreen = this.green == other.green;
		boolean sameBlue = this.blue == other.blue;
		boolean same = sameRed && sameGreen && sameBlue;

		if(!same) {
			return false;
		} 

		// Checking the spelling of the obj equal this
		String thisColour = this.name.substring(0, this.name.length());
		String objColour = other.name.substring(0, other.name.length());
		if(thisColour == objColour) {
			return true;
		} else if (thisColour != objColour){
			return false;
		}
		
		return same;
	}


	@Override
	// check if one colour is equal to a collection of colour, organize a collection of colour
	// in a range of colour, and check if the one colour matches that range, otherwise skip the check
	// use for efficientcy purpose, if two instances have the same equals they must have the same hashcode
	// its okay if 2 instances have the same hashcode
	public int hashCode() {
		// definitely not the best hash function, but understanding hashCodes is out of scope at the moment. 
		// auto generate hashcode --> right click on Colour.java --> Source --> Generate 
		// hasCode() and equal() and tell what do u care about object to be equal --> Generate
		return red + green + blue;
	}

}

