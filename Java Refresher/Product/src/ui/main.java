package ui;

import business.Product;
import db.ProductDB;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		String code, desc;
		int qty;
		double price, total;

		System.out.println("Welcome to the Line Item Calculator");
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			code = getInput("Enter product code: ");
			qty = Integer.parseInt(getInput("Enter quantity: "));
			
			product.setCode(code);
			product.setQty(qty);
			
			ProductDB db = ProductDB.getProduct(code);
			Product product = new Product();
			
			
			
		}
		
	}
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}

}
