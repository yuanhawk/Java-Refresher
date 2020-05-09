package CatchingException;

import java.lang.NumberFormatException;
import java.util.Scanner;

public class EnterMonthlyInvestment {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			double monthlyInvestment = 0.0;
			
			System.out.println("Enter monthly investment: ");
			
			try {
				monthlyInvestment = Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Enter valid number");
				continue; //Jump to the top of the loop, write try catch with loop
			}
			System.out.println(monthlyInvestment);
			
			System.out.println("Continue? (y/n): ");
			input = sc.nextLine();
		}
		sc.close();
	}

}
