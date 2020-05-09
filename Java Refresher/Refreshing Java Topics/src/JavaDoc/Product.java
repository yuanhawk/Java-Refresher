package JavaDoc;

import java.text.NumberFormat;

public class Product {

	/**
	 * The Product class represents a product and is used by the LineItem and ProductDB classes
	 */
	private String code, desc;
	private double price;
	
	/**
	 * Creates a new Product with default values
	 */
	public Product() {
		code = "";
		desc = "";
		price = 0.0;
	}

	
	/**
	 * Sets the product code to the specified String
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code; // this keyword refers to instance of obj
	}
	
	/**
	 * Returns a String that represents the product code
	 * @return
	 */
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
