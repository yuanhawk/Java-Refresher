package ui;

import java.util.Scanner;

import db.*;
import business.Product;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Viewer");
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			String code = getInput("Enter product code: ");
			
			ProductReader reader = new ProductDB(); // interface obj assigned to class instance
			Product product = reader.getProduct(code); //Advantage of swapping any other class that implements the ProductReader
			
			String message = "PRODUCT"
						+ "\nCode: " + product.getCode()
						+ "\nDescription: " + product.getDesc()
						+ "\nPrice: " + product.getPriceFormatted();
			
			System.out.println(message);
			
			input = getInput("Continue? (y/n): ");
		}
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
}
