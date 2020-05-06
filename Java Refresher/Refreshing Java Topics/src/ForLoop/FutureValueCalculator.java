package ForLoop;

import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueCalculator {
	
	public static void main(String[] args) {
		
		int monthlyInvestment, year;
		double interest, yearIntRate, monthIntRate;
		
		System.out.println("Welcome ot the Future Value Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			
			System.out.println("Enter monthly investment: ");
			monthlyInvestment = Integer.parseInt(sc.nextLine());
			System.out.println("Enter yearly interest rate: ");
			yearIntRate = Integer.parseInt(sc.nextLine());
			System.out.println("Enter number of years: ");
			year = Integer.parseInt(sc.nextLine());
			
			monthIntRate = yearIntRate / 100 / 12;
			int month = year * 12;
			
			double value = 0.0;
			for(int i = 0; i < month; i++) {
				value += monthlyInvestment;
				interest = value * monthIntRate;
				value += interest;
			}
			
			String valueFormatted = NumberFormat.getCurrencyInstance().format(value);
			
			String string = "Future value: " + valueFormatted + "\n\nContinue? (y/n): ";
			System.out.println(string);
			
			input = sc.nextLine();
		}
		
		if(input.equalsIgnoreCase("n")) {
			sc.close();
			System.out.println("\nBye!");
		}
		
	}

}
