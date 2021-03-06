package Arithmetic;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class InvoiceTotalCalculator {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Invoice Total Calculator");
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			String subtotal = getInput("Enter subtotal: ");
			System.out.println();
			
			BigDecimal subtotalbd = new BigDecimal(subtotal);
			BigDecimal discountbd = new BigDecimal(".1");
			String discount = NumberFormat.getPercentInstance().format(discountbd);
			BigDecimal discountAmount = subtotalbd.multiply(discountbd);
			discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP);
			BigDecimal totalBeforeTax = subtotalbd.subtract(discountAmount);
			BigDecimal tax = new BigDecimal(".045");
			BigDecimal salesTax = subtotalbd.multiply(tax);
			salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
			BigDecimal invoiceTotal = totalBeforeTax.add(salesTax);
			
			
			NumberFormat cur = NumberFormat.getCurrencyInstance();
			
			String message = "INVOICE"
					+ "Subtotal: " + cur.format(subtotalbd)
					+ "\nDiscount percent: " + discount
					+ "\nDiscount amount: " + cur.format(discountAmount)
					+ "\nTotal before tax: " + cur.format(totalBeforeTax)
					+ "\nSales tax: " + cur.format(salesTax)
					+ "\nInvoice total: " + cur.format(invoiceTotal);
			
			System.out.println(message);
			input = getInput("Continue? (y/n): ");
		}
		sc.close();
		System.out.println("Bye!");
	}

	public static String getInput(String s)  {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
}
