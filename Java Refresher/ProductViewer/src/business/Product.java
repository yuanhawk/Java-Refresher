package business;

import java.text.NumberFormat;

public class Product {

	private String code, desc;
	private double price;
	protected static int count = 0;
	
	public Product() {
		code = "";
		desc = "";
		price = 0.0;
	}
	
	// getter & setter for code, desc, price
	// instance var

	@Override
	public String toString() {
		return desc;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormatted() {
		String priceFormatted = NumberFormat.getCurrencyInstance().format(price);
		return priceFormatted;
	}
	
	/* Product
	 * setCode, getCode
	 * setDesc, getDesc
	 * setPrice, getPrice
	 * getPriceFormatted
	 * toString()
	 */
}
