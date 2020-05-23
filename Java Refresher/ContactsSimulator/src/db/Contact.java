package db;

import java.util.ArrayList;

public class Contact {

	private static String name;
	private static int number;
	private static String email;
	private static ArrayList<Message> messages;
	
	
	public Contact(String name, int number, String email, ArrayList<Message> messages) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.messages = messages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Message> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Message> messages) {
		Contact.messages = messages;
	}
	
	public void displayContact() {
		System.out.println("Name: " + Contact.getName() + "\nNumber: "
			+ Contact.getNumber() + "\nEmail: " + Contact.getEmail());
	}
	
}
