
public class Colour2 {

	private int red;
	private int green;
	private int blue;

	/*
    We provide our own constructor (which doesn't take any parameters).

    The Java compiler therefore no longer provides a default compiler.

    The fields are initialised in the constructor.
	 */
	public Colour2() { // empty parameter constructor
		this.red = 5; // using this to refer to fields better habit to prevent future error
		this.green = 5;
		this.blue = 5;
	}

	public void details() {
		System.out.println("colour(" 
				+ red + ", " 
				+ green + ", " 
				+ blue + ")");
	}

}

