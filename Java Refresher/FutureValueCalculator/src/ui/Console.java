package ui;

import java.util.Scanner;
import java.text.NumberFormat;

public class Console {

	private static Scanner sc = new Scanner(System.in);
	
	public static void closeScanner() {
		sc.close();
	}
	
	public static void displayLine() {
		System.out.println();
	}
	
	public static void displayLine(String s) {
		System.out.println(s);
	}
	
	public static String getString(String prompt) {
		System.out.println(prompt);
		String s = sc.nextLine();
		return s;
	}
	
	public static int getInt(String prompt) {
		int i = 0;
		while (true) {
			System.out.println(prompt);
			try {
				i = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Invaild integer. Try again.");
			}
		}
		return i;
	}
	
	public static double getDouble(String prompt, double min, double max) {
		double d = 0;
		while (true) {
			System.out.println(prompt);
			try {
				d = Double.parseDouble(sc.nextLine());
				NumberFormat number = NumberFormat.getNumberInstance();
				if (d < min) {
					System.out.println("Error! This number must be greater than or equal to "
							+ number.format(min) + ". Try again.");
				} else if (d > max) {
					System.out.println("Error! This number must be smaller than or equal to "
							+ number.format(max) + ". Try again.");
				} else {
					break;
				}	
			} catch (NumberFormatException e) {
				System.out.println("Error! Invalid value. Try again.");
			}
		}
		return d;
	}
}
