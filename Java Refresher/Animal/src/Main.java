
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		System.out.println("1. Bird\n2. Turtle\n3. Shepherd\n4. Huskey");
		
		int choice = sc.nextInt();
		
		Bird bird = new Bird(2, "Golden");
		Turtle turtle = new Turtle(4, "Green");
		Shepherd shepherd = new Shepherd(4, "Brown");
		Huskey huskey = new Huskey(4, "White");
		
		switch(choice) {
			case 1:
				bird.movement();
				bird.getDetails();
				break;
			case 2:
				turtle.movement();
				turtle.getDetails();
				break;
			case 3:
				shepherd.movement();
				shepherd.getDetails();
				break;
			case 4:
				huskey.movement();
				huskey.getDetails();
				break;
			default:
				break;
		}

	}
}
