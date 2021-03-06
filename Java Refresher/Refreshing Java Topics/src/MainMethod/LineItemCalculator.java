package MainMethod;

import java.util.Scanner;
import java.text.NumberFormat;

public class LineItemCalculator {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Line Item Calculator\n");
		
		String code, input, string, desc = "";
		int qty;
		double price = 0, total = 0;
		
		Scanner sc = new Scanner(System.in); // Scanner Object
		NumberFormat cur = NumberFormat.getCurrencyInstance();
		
		input = "y";
		
		while(input.equalsIgnoreCase("y")) { // While Loop
			
			System.out.println("Enter product code: ");
			code = sc.nextLine();
			System.out.println("Enter quantity: ");
			qty = Integer.parseInt(sc.nextLine());
			
			if (code.equals("java")) {
				price = 57.50;
				desc = "Murach's Java Programming";
			} else if(code.equals("jsp")) { //no elif
				price = 57.50;
			}
			
			total = price * qty;
			String priceFormatted = cur.format(price);
			String totalFormatted = cur.format(total);
				
			
			string = "LINE ITEM\n"
					+ "Code:\t\t" + code + "\n"
					+ "Description:\t" + desc + "\n"
					+ "Price:\t\t" + priceFormatted + "\n"
					+ "Quantity:\t" + qty + "\n"
					+ "Total:\t\t" + totalFormatted + "\n\n"
					+ "Continue? (y/n): ";
			
			System.out.println(string);
			
			input = sc.nextLine();
		}
		
		if (input.equalsIgnoreCase("n")) { // If-Else
			sc.close(); // Close Scanner obj
			System.out.println("\nBye!");
		} else {
			sc.close();
			System.out.println("Please rerun machine, you have typed an invalid input!");
		}
	}

}