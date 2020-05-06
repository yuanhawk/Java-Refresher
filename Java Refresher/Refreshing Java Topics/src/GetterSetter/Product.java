package GetterSetter;

import java.text.NumberFormat;

public class Product {

	// instance variable
	private String code, desc;
	private double price;
	
	//Constructor - create, construct, and obj fr class
	public Product() {
		code = "";
		desc = "";
		price = 0.0;
	}

	
	//Setter & Getter
	public void setCode(String code) {
		this.code = code; // this keyword refers to instance of obj
	}
	
	public String getCode() {
		return code;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	//custom getter
	public String getPriceFormatted() {
		String priceFormatted = NumberFormat.getCurrencyInstance().format(price);
		return priceFormatted;
	}
		
}