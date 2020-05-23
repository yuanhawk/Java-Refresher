
public class Turtle extends Animal{

	public Turtle(int legs, String colour) {
		super(legs, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movement() {
		super.movement();
		System.out.println("Walking...");
	}
	
	
}
