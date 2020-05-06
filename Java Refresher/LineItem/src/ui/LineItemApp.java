package ui;

import java.util.Scanner;

import db.ProductDB;
import business.LineItem;
import business.Product;

public class LineItemApp {
	
	static Scanner sc = new Scanner(System.in);
	
	//Contains the main method for the application
	
	public static void main(String[] args) {
		
		String code;
		int quantity;
		
		System.out.println("\nWelcome to the Line Item App");
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			code = getInput("Enter product code: ");
			quantity = Integer.parseInt(getInput("Enter quantity: "));

			Product product = ProductDB.getProduct(code);
			
			LineItem lineItem = new LineItem(product, quantity);
			
			String message = "\nLINE ITEM\n"
					+ "Code: " + product.getCode() + "\n"
					+ "Description: " + product.getDesc() + "\n"
					+ "Price: " + product.getPriceFormatted() + "\n"
					+ "Quantity: " + lineItem.getQuantity() + "\n"
					+ "Total: " + lineItem.getTotalFormatted() + "\n";
			
			System.out.println(message);
			
			input = getInput("Continue? (y/n): ");
			System.out.println();
		}
		sc.close();
		System.out.println("Bye!");
		
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}

}
