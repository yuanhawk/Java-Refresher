package ui;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.ArrayList;

import business.*;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Future Value Calculations");
		LineInvReader lir = new LineInv();
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			double monInv = getDouble("Enter monthly investment ($): ");
			double rate = getDouble("Enter interest rate: (%): ");
			double years = getDouble("Enter number of year(s): ");
			
			InvCalcReader icr = new InvCalc();
			icr.setMonthlyInv(monInv);
			icr.setRate(rate/100);
			icr.setYears(years);

			lir.addLineInv((InvCalc) icr);
			
			input = getInput("Continue? (y/n): ");
		}
		
		String message = getMessage(lir.getLineInv());
		System.out.println(message);
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
	
	public static double getDouble(String s) {
		System.out.println(s);
		double db;
		while(true) {
			try {
				db = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error, enter valid number");
			}
		}
		return db;
	}

	public static String getSpace(String header) {
		int length = header.length();
		
		LineInvReader lir = new LineInv();
		ArrayList<InvCalc> ic = lir.getLineInv();
		
		for (InvCalc inc: ic) {
			switch(header) {
				case "Inv/Mo.":
					String invMon = NumberFormat.getCurrencyInstance().format(inc.getMonthlyInv());
					if (invMon.length() > length) {
						length = invMon.length();
					}
					break;
				case "Rate":
					String rate = NumberFormat.getPercentInstance().format(inc.getRate());
					if (rate.length() > length) {
						length = rate.length();
					}
					break;
				case "Years":
					String years = Double.toString(inc.getYears());
					if (years.length() > length) {
						length = years.length();
					}
					break;
				case "Future Value":
					String futureValue = NumberFormat.getCurrencyInstance().format(inc.getFutureValue());
					if (futureValue.length() > length) {
						length = futureValue.length();
					}
					break;
			}

		}

		length -= header.length();;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length + 1; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
	
	public static String getSpace(String header, String space, String message) {
		int length = header.length() + space.length() - message.length();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
	
	public static String getMessage(ArrayList<InvCalc> ic) {
		String header1, header2, header3, header4, space1, space2, space3, message, spaceA, spaceB, spaceC;
		
		header1 = "Inv/Mo.";
		header2 = "Rate";
		header3 = "Years";
		header4 = "Future Value";
		
		space1 = getSpace(header1);
		space2 = getSpace(header2);
		space3 = getSpace(header3);
		
		message = "Future Value Calculations\n\n"
				+ header1 + space1 + header2 + space2 + header3 + space3 + header4 + "\n";
		
		StringBuilder sb = new StringBuilder(message);
		
		NumberFormat cur = NumberFormat.getCurrencyInstance();
		NumberFormat per = NumberFormat.getPercentInstance();
		for (InvCalc inc: ic) {
			String invMo = cur.format(inc.getMonthlyInv());
			String rate = per.format(inc.getRate());
			String years = Double.toString(inc.getYears());
			String futureValue = cur.format(inc.getFutureValue());
			
			spaceA = getSpace(header1, space1, invMo);
			spaceB = getSpace(header2, space2, rate);
			spaceC = getSpace(header3, space3, years);
			
			message = invMo + spaceA + rate + spaceB + years + spaceC + futureValue + "\n";
			sb.append(message);
		}
		
		return sb.toString();
	}
}
