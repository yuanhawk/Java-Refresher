package business;

import java.text.NumberFormat;

public class Product {
	
	private String code, desc, priceFormatted;
	private double price;
	
	public Product() {
		code = "";
		desc = "";
		price = 0.0;
		priceFormatted = "";
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
	
	@Override
	public String toString() {
		String message = "PRODUCT\n"
						+"Code: " + code
						+"Description: " + desc
						+"Price: " + priceFormatted;
		return message;
	}
}
