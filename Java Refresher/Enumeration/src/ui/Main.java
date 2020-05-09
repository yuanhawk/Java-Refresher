package ui;

import java.util.Scanner;

import db.*;

import en.*;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome the Discount Calculator");
		
		String type = getInput("Enter type: ");
		CustomerReader reader = new CustomerDB(); // Interface - Class
		double discountPercent = reader.getDiscountType(type);
		CustomerType typer = reader.getType(type);
		
		
		String message = "Discount Percent: " + discountPercent
					+ "\ntoString: " + typer.toString();
		
		System.out.println(message);
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}

}
