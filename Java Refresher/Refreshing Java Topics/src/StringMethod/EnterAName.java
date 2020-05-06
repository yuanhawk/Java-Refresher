package StringMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterAName {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name = getName("Enter a name: ");
		
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			String character = Character.toString(c);
			if (character.equals(" ")) {
				index.add(i);
			}
		}
		
		String firstName, middleName, lastName, message;
		if (index.size() == 1) {
			firstName = name.substring(0, index.get(0));
			lastName = name.substring(index.get(0)+1);
			
			message = "First name: " + firstName
					+ "\nLast name: " + lastName;
			System.out.println(message);
		} else if (index.size() == 2) {
			firstName = name.substring(0, index.get(0));
			middleName = name.substring(index.get(0)+1, index.get(1));
			lastName = name.substring(index.get(1)+1);

			message = "First name: " + firstName
					+ "\nMiddle name: " + middleName
					+ "\nLast name: " + lastName;
			
			System.out.println(message);
		} else {
			System.out.println("Error!");
		}
	}

	public static String getName(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}
}
