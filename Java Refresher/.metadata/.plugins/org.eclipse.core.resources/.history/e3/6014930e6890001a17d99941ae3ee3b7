package ui;

import java.util.Scanner;

import business.Product;
import db.ProductDB;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Product Application");
		
		String input = "y";
		int i = 0;
		while (input.equalsIgnoreCase("y")) {
			String code = getInput("Enter product code: ");
			
			Product p = ProductDB.getProduct(code);
			String message = "";
			if (p != null) {
				i++;
				message = "Description: " + p.toString()
						+ "\nPrice: " + p.getPriceFormatted()
						+ "\n\nProduct count: " + i;
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
