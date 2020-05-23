
public class Animal {
	
	private int legs;
	private String colour;

	public Animal(int legs, String colour) {
		super();
		this.legs = legs;
		this.colour = colour;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void movement() {
		System.out.println("Movement Begin...");
	}
	
	public void getDetails() {
		System.out.println("Legs: " + this.legs);
		System.out.println("Colour: " + this.colour);
	}
}
