public class Pokemon {

	private String name; // this is a field
	private int level;   // this is a field

	public Pokemon() {  // if nothing was provided i'm just gonna give  
		this.name = ""; //its name empty String
		this.level = 1; // and level is level 1
	}

	public Pokemon(String name, int level) { // provided 2 parameter when provide pokemon instance 
		this.name = name; 	// and should be type String and type int whatever those values are, I'll copy them over to characteristic
		this.level = level;	//   or fields of the pokemon class, this.name and this. level are attributes
	}

	public void details() {
		System.out.println("Pokemon " + this.name + " is level " + this.level); // print the detail of pokemon
	}

	public void attack() {
		System.out.println(this.name + " attack!"); // do attack
		this.level++; // this. means grab the field, in this case we take level and increase its lvl by 1
	}

}

