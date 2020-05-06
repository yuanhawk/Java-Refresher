package Rectangle;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		double length, width;
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Welcome to the Area and Perimeter Application");
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			
			length = Double.parseDouble(getInput("Enter length: "));
			width = Double.parseDouble(getInput("Enter width: "));
			
			rect.setLength(length);
			rect.setWidth(width);
			
			String message = "AREA AND PERIMETER"
					+ "\nArea: " + rect.getArea()
					+ "\nPerimeter: " + rect.getPerimeter();
			
			System.out.println(message);
			input = getInput("Continue? (y/n): ");			
		}
		System.out.println("Bye!");
		sc.close();
			
	}

	private static Scanner sc = new Scanner(System.in);
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
}
