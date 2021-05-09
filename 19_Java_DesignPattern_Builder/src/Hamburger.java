import java.util.StringJoiner;

public class Hamburger {

	private String name; 			// mandatory
	private String size; 			// mandatory
	private boolean extraCheese; 	// optional
	private boolean addChips; 		// optional

	private Hamburger(Builder builder) {
		this.name = builder.name;
		this.size = builder.size;
		this.extraCheese = builder.extraCheese;
		this.addChips = builder.addChips;
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
	
	
	public static class Builder {
		private String name; 			// mandatory
		private String size; 			// mandatory
		private boolean extraCheese = false; 	// optional
		private boolean addChips = false; 		// optional
		
		// costructor
		public Builder(String name, String size) {
			this.name = name;
			this.size = size;
		}
		
		// setter
		public Builder addExtraCheese() {
			this.extraCheese = true;
			return this;
		}
		
		// setter
		public Builder addSomeChips() {
			this.addChips = true;
			return this;
		}
		
		public Hamburger build() {
			return new Hamburger(this);
		}
		
	}
	

}