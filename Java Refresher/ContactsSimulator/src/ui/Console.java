package ui;

import java.util.Scanner;

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
		while(true) {
			System.out.println(prompt);
			try {
				i = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Invalid option, please try again.");
			}
		}
		return i;
	}

}
