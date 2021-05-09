
public class Main {
	
	public static void main(String[] args) {
//		Hamburger burger = new Hamburger("DoubleCheeseBurger", "XL", false, true);
		
		Hamburger burger = new Hamburger.Builder("DoubleCheeseBurger", "XL")
				.addExtraCheese()
				.addSomeChips()
				.build();
		
		System.out.println(burger);
	}
	
}