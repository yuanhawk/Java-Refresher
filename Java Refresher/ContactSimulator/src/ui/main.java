package ui;

import db.Contact;
import db.Message;
import java.util.ArrayList;

public class main {
	
	private String name;
	private int number;
	private String email;
	private static ArrayList<Contact> contacts;
	
	public static void main(String[] args) {
		contacts = new ArrayList<Contact>();
		Console.displayLine("Welcome to Contacts and Messaging Simulator v1.1");
		Console.displayLine();
		
		String a = Console.getString("Would you like to launch Simulator? (y/n)");
		if (a.equalsIgnoreCase("y")) {
			startPage();
		}
	}
	
	public static void startPage() {
		int b1 = Console.getInt("What would like to do?\n"
				+ "1. Manage Contacts\n"
				+ "2. Send Messages\n"
				+ "3. Back");
		
		switch(b1) {
			case 1: contactList();
				break;
			case 2: sendMessage();
				break;
			case 3: startPage();
				break;
			default:
				break;
		}
	}
	
	public static void contactList() {
		int c1 = Console.getInt("What would like to do?\n"
				+ "1. Add Contacts\n"
				+ "2. Remove Contacts\n"
				+ "3. Display All Contacts\n"
				+ "4. Search Contacts\n"
				+ "5. Back");
		
		switch(c1) {
		case 1: addContact();
			break;
		case 2: removeContact();
			break;
		case 3: displayContacts();
			break;
		case 4: searchContacts();
			break;
		case 5: startPage();
			break;
		default:
			break;
		}
	}
	
	private static void sendMessage() {
		String messageReceiver = Console.getString("Who would you like to send the message to? ");
		
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(messageReceiver)) {
				String text = Console.getString("Input your message");
				
				Message message = new Message(text, messageReceiver);
				contacts.get(i).addMessage(message);
				Console.displayLine("Message sent");
			}
		}
		startPage();
	}
	
	public static void addContact() {		
		String newContact = Console.getString("Please input name: ");
		int newNumber = Console.getInt("Please input phone number: ");
		String newEmail = Console.getString("Please input email: ");
		
		Contact newContacts = new Contact(newContact, newNumber, newEmail);
		contacts.add(newContacts);
		
		Console.displayLine("Contact added successfully");
		startPage();
	}
	
	public static void removeContact() {
		String removeContact = Console.getString("Which contact would you like to delete?");
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getName().equals(removeContact)) {
				contacts.remove(contacts.get(i));
				Console.displayLine("Contact removed successfully");
			}
		}
		startPage();
	}
	
	public static void displayContacts() {
		if(contacts.size() > 0) {
			for(int i = 0; i < contacts.size(); i++) {
				contacts.get(i).displayContactDetails();
				Console.displayLine("*****************");
			}
		} else {
			Console.displayLine("There are no available contacts");
		}
		startPage();
	}
	
	public static void searchContacts() {

		String searchName = Console.getString("Who would you like to search for?");
		for (int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getName().equals(searchName)) {
				contacts.get(i).displayContactDetails();
			}
		}
		startPage();
	}
	
	
	

}
