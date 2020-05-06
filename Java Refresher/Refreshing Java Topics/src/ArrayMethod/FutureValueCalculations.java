package ArrayMethod;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class FutureValueCalculations {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Double> monInv = new ArrayList<Double>();
	private static ArrayList<Double> rate = new ArrayList<Double>();
	private static ArrayList<Double> years = new ArrayList<Double>();
	
	public static void main(String[] args) {
		
		System.out.println("Future Value Calculations\n");
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			monInv = getMonthlyInvestment("Enter monthly investment: ");
			rate = getYearlyInterestRate("Enter interest rate: ");
			years = getYears("Enter number of years: ");
			
			input = getInput("Continue? (y/n): ");
		}
		sc.close();
		
		ArrayList<Double> futureValue = new ArrayList<Double>();
		for (int i = 0; i < monInv.size(); i++) { //First row of list
			double monthlyInvestment = monInv.get(i);
			double interestRate = rate.get(i);
			double year = years.get(i);
			
			double monthlyInterestRate = interestRate / 12 / 100;
			double month = year * 12;
			double value = 0;
			for (int j = 0; j < month; j++) {
				value += monthlyInvestment;
				double interest = value * monthlyInterestRate;
				value += interest;
			}
			futureValue.add(value);
		}
			
		StringBuilder message = new StringBuilder("Inv/Mo. Rate Years Future Value\n");
		for (int k = 0; k < monInv.size(); k++) {
			NumberFormat cur = NumberFormat.getCurrencyInstance();
			String monthlyInvestment = cur.format(monInv.get(k));
			String interestRate = NumberFormat.getPercentInstance().format(rate.get(k) / 100);
			int year = (int)Math.round(years.get(k));
			String futureValueFormatted = cur.format(futureValue.get(k));
			
			message.append(monthlyInvestment + " " + interestRate + "   " + year + "    " + futureValueFormatted + "\n");
		}
		System.out.println(message);
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
	
	public static ArrayList<Double> getMonthlyInvestment(String s) {
		System.out.println(s);
		double value;
		while(true) {
			try {
				value = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Please re-enter valid number");
			}
		}
		monInv.add(value);
		return monInv;
	}
	
	public static ArrayList<Double> getYearlyInterestRate(String s) {
		System.out.println(s);
		double value;
		while(true) {
			try {
				value = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Please re-enter valid number");
			}
		}
		rate.add(value);
		return rate;
	}
	
	public static ArrayList<Double> getYears(String s) {
		System.out.println(s);
		double value;
		while(true) {
			try {
				value = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Please re-enter valid number");
			}
		}
		years.add(value);
		return years;
	}

}
