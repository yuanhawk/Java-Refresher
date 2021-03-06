package business;

import java.text.NumberFormat;

public class LineItem {
	
	private Product product;
	private int quantity;
	
	public LineItem() {
		this.product = null;
		this.quantity = 0;
	}
	
	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotal() {
		double total = quantity * product.getPrice();
		return total;
	}
	
	public String getTotalFormatted() {
		double total = this.getTotal();
		String totalFormatted = NumberFormat.getCurrencyInstance().format(total);
		return totalFormatted;
	}
	
}

/*
 * Instance var of the class, 1 - Product obj for the product & 2nd instance var stores an int val for the qty
 * Constructor initialises the instance var to null
 * 2nd constructor allows user to supply product and qty for line item
 */
