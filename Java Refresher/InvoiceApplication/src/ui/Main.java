package ui;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

import business.Product;
import db.*;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Invoice application");
		
		ArrayList<String> codeAL = new ArrayList<String>();
		ArrayList<Integer> qtyAL = new ArrayList<Integer>();
		ArrayList<String> qtyFormattedAL = new ArrayList<String>();
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			String code = getInput("Enter product code: ");
			int qty = getQty("Enter quantity: ");
			String qtyFormatted = Integer.toString(qty);
			
			codeAL.add(code);
			qtyAL.add(qty);
			qtyFormattedAL.add(qtyFormatted);
			
			input = getInput("Another line item? (y/n): ");
		}
		
		ArrayList<String> descAL = new ArrayList<String>();
		ArrayList<Double> priceAL = new ArrayList<Double>();
		ArrayList<String> priceFormattedAL = new ArrayList<String>();
		
		ProductReader reader = new ProductDB();
		for(String c: codeAL) {
			Product product = reader.getProduct(c);
			descAL.add(product.getDesc());
			priceAL.add(product.getPrice());
			priceFormattedAL.add(product.getPriceFormatted());
		}
		
		String header1 = "Description";
		String header2 = "Price";
		String header3 = "Qty";
		String header4 = "Total";
		
		String space1 = getSpace(descAL, header1);
		String space2 = getSpace(priceFormattedAL, header2);
		String space3 = getSpace(qtyFormattedAL, header3);
		
		String message = header1 + space1 + header2 + space2 + header3 + space3 + header4 + "\n";
		
		StringBuilder messageSB = new StringBuilder(message);
		
		double totalInvoice = 0.0;
		for (int i = 0; i < codeAL.size(); i++) {
			String desc = descAL.get(i);
			String spaceA = getSpace(header1, space1, desc);
			
			String priceFormatted = priceFormattedAL.get(i);
			String spaceB = getSpace(header2, space2, priceFormatted);
			
			String quantity = qtyFormattedAL.get(i);
			String spaceC = getSpace(header3, space3, quantity);
			
			double price = priceAL.get(i);
			int qty = qtyAL.get(i);
			double total = price * qty;
			totalInvoice += total;
			String totalFormatted = NumberFormat.getCurrencyInstance().format(total);
			
			String innerMessage = desc + spaceA + priceFormatted + spaceB + quantity + spaceC + totalFormatted + "\n";
			messageSB.append(innerMessage);
		}
		
		String totalInvoiceFormatted = NumberFormat.getCurrencyInstance().format(totalInvoice);
		String lastLine = "\nInvoice total: " + totalInvoiceFormatted; 
		
		messageSB.append(lastLine);
		System.out.println(messageSB);
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
	
	public static int getQty(String s) {
		int qty = 0;
		System.out.println(s);
		while (true) {
			try {
				qty = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Please enter valid integer");
			}
		}
		return qty;
	}
	
	public static String getSpace(ArrayList<String> value, String header) {
		int length = header.length();
		for (String v: value) {
			if (v.length() > length) {
				length = v.length();
			}
		}
		StringBuilder spaceSB = new StringBuilder();
		length -= header.length();
		for (int i = 0; i < length + 1; i++) {
			spaceSB.append(" ");
		}
		String space = spaceSB.toString();
		return space;
	}
	
	public static String getSpace(String header, String maxSpace, String newS) {
		int length = header.length() + maxSpace.length() - newS.length();
		
		StringBuilder spaceSB = new StringBuilder();
		for (int i = 0; i < length; i++) {
			spaceSB.append(" ");
		}
		String space = spaceSB.toString();
		return space;
	}

}
