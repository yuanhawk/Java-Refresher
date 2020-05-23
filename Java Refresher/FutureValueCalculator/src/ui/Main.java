package ui;

import java.text.NumberFormat;

import business.Financial;

public class Main {

	public static void main(String[] args) {
		Console.displayLine("Welcome to the Future Value Calculator");
		Console.displayLine();
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			double monthlyInvestment = Console.getDouble("Enter monthly investment: ", 0, 10000);
			double yearlyInterestRate = Console.getDouble("Enter yearly interest rate: ", 0, 20);
			int years = Console.getInt("Enter number of years: ");
			
			double futureValue = Financial.calculateFutureValue(monthlyInvestment, yearlyInterestRate, years);
			
			Console.displayLine("Future Value: " + NumberFormat.getCurrencyInstance().format(futureValue));
			Console.displayLine();
			
			choice = Console.getString("Continue? (y/n): ");
			Console.displayLine();
		}
		Console.closeScanner();
		Console.displayLine("Bye!");
	}
}
