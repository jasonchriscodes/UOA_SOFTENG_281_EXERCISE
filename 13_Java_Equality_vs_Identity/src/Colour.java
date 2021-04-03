
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

	@Override
	public boolean equals(Object obj) {
		// exact same instance?
		if (this == obj) {
			return true;
		}

		// is the other reference null?
		if (obj == null) {
			return false;
		}

		// same class type?
		Class typeOfThisInstance = this.getClass();
		Class typeOfOtherInstance = obj.getClass();
		if (typeOfThisInstance != typeOfOtherInstance) {
			return false;
		}

		// Otherwise, they are the same types, so cast the Object to Colour
		Colour other = (Colour) obj;

		// Do the attributes we care about have the same values?
		boolean sameRed = this.red == other.red;
		boolean sameGreen = this.green == other.green;
		boolean sameBlue = this.blue == other.blue;
		boolean same = sameRed && sameGreen && sameBlue;

		return same;
	}

	@Override
	public int hashCode() {
		// definitely not the best hash function, but understanding hashCodes is out of scope at the moment. 
		return red + green + blue;
	}

}

