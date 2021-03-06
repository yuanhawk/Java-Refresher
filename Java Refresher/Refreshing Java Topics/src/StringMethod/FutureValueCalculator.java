package StringMethod;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueCalculator {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Future Value Calculator");
		
		String input = "y";
		while (input.equalsIgnoreCase("y")) {
			
			String monthlyInvestments = getInput("Enter monthly investment: ");
			StringBuilder monthlyInvestmentsb = new StringBuilder(monthlyInvestments);
					
			if (monthlyInvestments.indexOf("$") == 0) {
				monthlyInvestmentsb.delete(0, 1);
			}
			double monthlyInvestment = Double.parseDouble(monthlyInvestmentsb.toString());
			
			String yearlyInterestRates = getInput("Enter yearly interest rate: ");
			StringBuilder yearlyInterestRatesb = new StringBuilder(yearlyInterestRates);
			
			if (yearlyInterestRates.indexOf("%") == yearlyInterestRates.length() - 1) {
				yearlyInterestRatesb.delete(yearlyInterestRates.indexOf("%"), yearlyInterestRates.length());
			}
			double yearlyInterestRate = Double.parseDouble(yearlyInterestRatesb.toString());
			
			double year = Double.parseDouble(getInput("Enter number of years: "));
			
			double monthlyInterestRate = yearlyInterestRate / 12 / 100;
			double month = year * 12;
			double futureValue = 0.0;
			for (int i = 0; i < month; i++) {
				futureValue += monthlyInvestment;
				double interest = futureValue * monthlyInterestRate;
				futureValue += interest;
			}
			
			String futureValueFormatted = NumberFormat.getCurrencyInstance().format(futureValue);
			System.out.println("Future value: " + futureValueFormatted);
			
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

}
