package ui;

import java.util.Scanner;

public class console {
	
	private static Scanner sc = new Scanner(System.in);

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
		int i;
		while(true) {
			System.out.println(prompt);
			try {
				i = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number. Please create a random number and save it.");
			}
		}
		return i;
	}
	
}
