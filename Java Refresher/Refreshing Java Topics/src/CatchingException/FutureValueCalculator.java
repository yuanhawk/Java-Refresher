package CatchingException;

import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.NumberFormatException;

public class FutureValueCalculator {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Future Value Calculator\n");
		
		double monthlyInvestment = 0.0, yearlyInterestRate, monthlyInterestRate, years, months;
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {

			monthlyInvestment = getDouble("Enter monthly investment: ");
			yearlyInterestRate = getDouble("Enter yearly interest rate: ");
			years = getDouble("Enter number of years: ");
			
			months = years * 12;
			monthlyInterestRate = yearlyInterestRate / 100 / 12;
			BigDecimal monthlyInterestRatebd = new BigDecimal(monthlyInterestRate);
			BigDecimal futureValuebd = new BigDecimal(0.0);
			BigDecimal monthlyInvestmentbd = new BigDecimal(monthlyInvestment);
			
			for (int i = 0; i < months; i++) {
				futureValuebd = futureValuebd.add(monthlyInvestmentbd);
				BigDecimal monthlyInterestbd = futureValuebd.multiply(monthlyInterestRatebd);
				monthlyInterestbd = monthlyInterestbd.setScale(2, RoundingMode.HALF_UP);
				futureValuebd = futureValuebd.add(monthlyInterestbd);
			}
			
			String futureValueFormatted = NumberFormat.getCurrencyInstance().format(futureValuebd);
			
			String message = "Future value: " + futureValueFormatted;
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
	
	public static double getDouble(String s) {
		double value = 0;
		while (true) {
			System.out.println(s);
			try {
				value = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Invalid integer. Try again.");
			}
		}
		return value;
	}

}
