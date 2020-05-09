package business;

import java.text.NumberFormat;

public abstract class Product { // can only be inherited, no class can be created
	
	private String code, desc;
	private double price;
	
	public Product() {
		code = "";
		desc = "";
		price = 0.0;
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
		return desc;
	}

}
