package ui;

import business.*;
import db.EmployeeDB;

import java.util.Scanner;

public class Main implements Displayable {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Displayable Test application");
		
		String input = "y";
		while(input.equalsIgnoreCase("y")) {
			
			String name = getInput("Enter name: ");
			
			EmployeeReader reader = new EmployeeDB();
			Employee employee = reader.getEmployee(name);
			
			String message = employee.displayText();
			System.out.println(message);
			
			input = getInput("Continue? (y/n): ");
		}
		sc.close();
	}
	
	public static String getInput(String s) {
		System.out.println(s);
		String input = sc.nextLine();
		return input;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDept() {
		// TODO Auto-generated method stub
		return null;
	}
}
