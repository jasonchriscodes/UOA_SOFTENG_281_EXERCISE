
public class Colour3 {

	private int red = 100;
	private int green = 100;
	private int blue;

	/*
    We provide our own constructor (which doesn't take any parameters).

    The Java compiler therefore no longer provides a default compiler.

    The fields are initialised in the constructor.
	 */
	public Colour3() {
		this.red = 255;
		this.green = 255;
		this.blue = 255;
	}

	public Colour3(int red) {
		this.red = red;
		// Should explicitly initialise blue
	}

	public Colour3(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public void details() {
		System.out.println("colour(" 
				+ red + ", " 
				+ green + ", " 
				+ blue + ")");
	}

}

