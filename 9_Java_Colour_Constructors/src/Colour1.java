
public class Colour1 {

	private int red = 255;
	private int green = 255;
	private int blue = 255;

	/*
    No constructor is defined, so the Java compiler
    provides us with a default compiler. 

    The fields are initialised in the declarations above.
	 */

	public void details() {
		System.out.println("colour(" 
				+ red + ", " 
				+ green + ", " 
				+ blue + ")");
	}

}

