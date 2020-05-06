package ArrayMethod;

import java.util.Scanner;

public class MonthSelector {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Month Selector");
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			int monthNum;
			while(true) {
				monthNum = getMonthNum("Enter month number: ");
				if (monthNum > 0 && monthNum < 13) {
					break;
				}
				System.out.println("Error! Enter valid integer month");
			}
			
			String[] month = {"January", "February", "March", "April", "May", "June", "July", "August",
					"September", "October", "November", "December"};
			
			String message = "You selected: " + month[monthNum-1];
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
	
	public static int getMonthNum(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		int num = 0;
		while(true) {
			try {
				num = Integer.parseInt(input);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Enter valid integer value");
			}
		}
		return num;
	}

}