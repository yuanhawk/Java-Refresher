package ui;

import java.util.ArrayList;
import db.Contact;

public class main {
	
	private static String name;
	private static int number;
	private static String email;
	private static int id;
	private static ArrayList<Contact> contacts;

	public static void main(String[] args) {
		Console.displayLine("Welcome to Contact Simlulator v1.0");
		Console.displayLine();

		String a1 = Console.getString("Would like to Launch Simulator? (y/n)");
		
		if (a1.equalsIgnoreCase("y")) {
			home();
		} else {
			Console.closeScanner();
		}
		
	}
	
	public static void home() {
		
		Console.displayLine("What would you like to do?");
		
		String s1 = "1. Manage Contacts\n2. Send Messages\n3. Quit";
		int b1 = Console.getInt(s1);
		
		switch (b1) {
			case 1:
				contacts();
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
		}
	}
	
	public static void contacts() {
		Console.displayLine("What would you like to do in your contacts?");
		Console.displayLine();
		
		String s2 = "1. Search Contacts\n2. Add Contacts\n3. Delete Contacts"
				+ "\n4. Show All Contacts\n5. Back";
		int b2 = Console.getInt(s2);
		
		switch (b2) {
		case 1:
			searchContacts();
			break;
		case 2:
			addContacts();
			break;
		case 3:
			break;
		case 4: allContacts();
			break;
		default:
			break;
		}
	}
		
	public static void searchContacts() {
		
		String contactName = Console.getString("Please input name");
		

		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).displayContact().equals(contactName)) {
				contacts.get(i).displayContact();
			}
		}
		
	}
	
	public static void addContacts() {
		
		String d1 = "y";
		while (d1.equalsIgnoreCase("y")) {
			
			
			Console.displayLine("Please add the following to create new contact");
			String newName = Console.getString("Enter Name");
			int newNumber = Console.getInt("Enter Phone Number");
			String newEmail = Console.getString("Enter Email");
			
			Contact newContact = new Contact(newName, newNumber, newEmail, null);
			contacts.add(newContact);
			
			Console.displayLine("Contacts added successfully");
			
			d1 = Console.getString("Would you like to add another contact? (y/n)");
			if (d1.equalsIgnoreCase("n")) {
				break;
			}
		}
		String d2 = Console.getString("Would your like to return to main screen? (y/n)");
		if (d2.equalsIgnoreCase("y")) {
			home();
		}
	}
	
	public static void allContacts() {
		if (contacts.size() > 0) {
			for(int i = 0; i < contacts.size(); i++) {
				contacts.get(i).displayContact();
				Console.displayLine("******************");
			}
		} else {
			Console.displayLine("The contact list is empty.");
		}
	}
}
