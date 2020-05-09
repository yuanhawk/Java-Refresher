package ui;

import business.*;
import db.ProductDB;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Product Viewer");
		
		int i = 0;
		String input = "y";
		while (input.equalsIgnoreCase("y")) {
		
			String code = getInput("Enter product code: ");
			
			String message;
			
			Product product = ProductDB.getProduct(code);
			if (product != null) {
				i++;
				message = "Description: " + product.toString()
						+"\nPrice: " + product.getPriceFormatted()
						+"\n\nProduct count: " + i;
			} else {
				message = "No product matches this product code.";
			}
			System.out.println(message);
			
			input = getInput("Continue? (y/n): ");
		}
		sc.close();
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
	

}
