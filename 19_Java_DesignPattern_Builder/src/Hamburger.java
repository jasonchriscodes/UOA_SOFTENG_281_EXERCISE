import java.util.StringJoiner;

public class Hamburger {

	private String name; 			// mandatory
	private String size; 			// mandatory
	private boolean extraCheese; 	// optional
	private boolean addChips; 		// optional

	public Hamburger(String name, String size, boolean extraCheese, boolean addChips) {
		this.name = name;
		this.size = size;
		this.extraCheese = extraCheese;
		this.addChips = addChips;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Hamburger.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("size='" + size + "'")
				.add("extraCheese=" + extraCheese)
				.add("addChips=" + addChips)
				.toString();
	}

}