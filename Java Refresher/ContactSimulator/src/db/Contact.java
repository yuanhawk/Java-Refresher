package db;

import java.util.ArrayList;

public class Contact {
	
	private String name;
	private int number;
	private String email;
	private ArrayList<Message> messages;
	

	public Contact(String name, int number, String email, ArrayList<Message> messages) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.messages = messages;
	}
	
	public Contact(String name, int number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.messages = new ArrayList<>();
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
		this.messages = messages;
	}
	
	public void displayContactDetails() {
		System.out.println("Name: " + getName()
		+"\tNumber: " + getNumber()
		+"\tEmail: " + getEmail());
	}
	
	public void addMessage(Message message) {
		this.messages.add(message);
	}

}
