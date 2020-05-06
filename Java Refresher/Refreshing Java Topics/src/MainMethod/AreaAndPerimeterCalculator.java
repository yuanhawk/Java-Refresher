package MainMethod;

import java.util.Scanner;
import java.text.NumberFormat;

public class AreaAndPerimeterCalculator {
	
	public static void main(String[] args) {
		
		double length, width;
		String string;
		
		System.out.println("Welcome to the Area and Perimeter Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		NumberFormat num = NumberFormat.getNumberInstance();
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			System.out.println("Enter length: ");
			length = Double.parseDouble(sc.nextLine());
			System.out.println("Enter width: ");
			width = Double.parseDouble(sc.nextLine());
			
			String area = num.format(length * width);
			String perimeter = num.format(2 * length + 2 * width);
			
			
			string = "Area: " + area + "\n"
					+ "Perimeter: " + perimeter + "\n\nContinue? (y/n): ";
			
			System.out.println(string);
			input = sc.nextLine();			
		}
		
		sc.close();
		System.out.println("\nBye!");
		
	}

}
