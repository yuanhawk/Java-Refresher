package business;

import java.text.NumberFormat;

import db.ProductDB;

public class Product() {
	
	private String code, desc;
	private int qty;
	private double price, total;
	
	NumberFormat cur = NumberFormat.getCurrencyInstance();
	
	public Product() {
		code = "";
		desc = "";
		qty = 0;
		price = 0;
		total = 0;
	}
	
	//List of getter & setter
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
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		total = price * qty;
		return total;
	}

	public String getPriceFormatted() {
		String priceFormatted = cur.format(price);
		return priceFormatted;
	}
	
	public String getTotalFormatted() {
		String totalFormatted = cur.format(total);
		return totalFormatted;
	}
}
