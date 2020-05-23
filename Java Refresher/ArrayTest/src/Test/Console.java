package Test;

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
		System.out.print(prompt);
		String s = sc.nextLine();
		return s;
	}
	
	public static int getInt(String prompt) {
		int i = 0;
		while (true) {
			System.out.print(prompt);
			try {
				i = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Please key in valid integer. Try again");
			}
		}
		return i;
	}
	
}
