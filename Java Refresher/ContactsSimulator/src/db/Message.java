package db;

public class Message {
	
	private String text;
	private String receiver;
	private int id;
	
	public Message(String text, String receiver, int id) {
		super();
		this.text = text;
		this.receiver = receiver;
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
