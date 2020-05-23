package Test;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			Console.displayLine("Welcome to the Month Selector");
			Console.displayLine();
			
			int number = Console.getInt("Enter month number: ");
			
			String[] monthList = {"January", "February", "March", "April", "May", "June",
					"July", "Aug", "Sep", "Oct", "Nov", "Dec"};
			
			int monthIndex = number - 1;
			Console.displayLine("You have selected: " + monthList[monthIndex] + "\n");
			
			choice = Console.getString("Continue? (y/n): ");
		}
		Console.displayLine("Bye!");
		Console.closeScanner();
	}
}
