package business;

import java.text.NumberFormat;

public class Product implements ProductGettable {
	
	private String code, desc;
	private double price;
	private int qty;
	
	public Product() {
		code = "";
		desc = "";
		price = 0.0;
		qty = 0;
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
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getPriceFormatted() {
		String priceFormatted = NumberFormat.getCurrencyInstance().format(price);
		return priceFormatted;
	}
	
}
