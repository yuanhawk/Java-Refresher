package CatchingException;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class InvoiceApplication {
		
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Invoice Calculator");
		
		String input = "y";
		while (input.equalsIgnoreCase("y")) {
			String customer = getInput("Enter customer type (r/c/t): ");
			
			double subtotal;
			while (true) {
				try {
					subtotal = Double.parseDouble(getInput("Enter subtotal: "));
					break; // Exits loop
				} catch (NumberFormatException e) {
					System.out.println("Error! Invalid number. Try again.");
				}
			}
			
			BigDecimal subtotalbd = new BigDecimal(subtotal);
			
			double discountPercent = getDiscountPercent(customer, subtotal);
			BigDecimal discountPercentbd = new BigDecimal(discountPercent);
			String discountPercentFormatted = NumberFormat.getPercentInstance().format(discountPercent);
			
			BigDecimal discountAmountbd = subtotalbd.multiply(discountPercentbd);
			discountAmountbd = discountAmountbd.setScale(2, RoundingMode.HALF_UP);
			
			BigDecimal totalBeforeTaxbd = subtotalbd.subtract(discountAmountbd);
			
			BigDecimal taxbd = new BigDecimal(".045");
			BigDecimal salesTaxbd = subtotalbd.multiply(taxbd);
			
			BigDecimal invoiceTotalbd = totalBeforeTaxbd.add(salesTaxbd);
			
			NumberFormat cur = NumberFormat.getCurrencyInstance();
			
			String message = "INVOICE\n"
					+ "Subtotal:\t\t" + cur.format(subtotalbd)
					+ "\nDiscount percent:\t" + discountPercentFormatted
					+ "\nDiscount amount:\t" + cur.format(discountAmountbd)
					+ "\nTotal before tax:\t" + cur.format(totalBeforeTaxbd)
					+ "\nSales Tax:\t\t" + cur.format(salesTaxbd)
					+ "\nInvoice total:\t\t" + cur.format(invoiceTotalbd);
			
			System.out.println(message);			
			input = getInput("Continue? (y/n): ");			
		}
		sc.close();
		System.out.println("Bye!");
		
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
	
	public static double getDiscountPercent(String customer, double subtotal) {
		double discountPercent = 0.0;
		
		switch (customer) {
			case "r":
				if (subtotal >= 250 && subtotal < 500) {
					discountPercent = .25;
				} else if (subtotal >= 500) {
					discountPercent = .3;
				}
				break;
			case "c":
				discountPercent = .2;
				break;
			case "t":
				if (subtotal < 500) {
					discountPercent = .4;
				} else if (subtotal >= 500) {
					discountPercent = .5;
				}
				break;
			default:
				discountPercent = 0.0;
				break;
		}				
		return discountPercent;
		
	}

}
