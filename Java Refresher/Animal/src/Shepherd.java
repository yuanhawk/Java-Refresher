
public class Shepherd extends Dog{

	public Shepherd(int legs, String colour) {
		super(legs, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movement() {
		super.movement();
		System.out.println("Running...");
	}

}
