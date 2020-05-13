package business;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Product {
	
	private ArrayList<LineItem> lineItems;
	
	public Product() {
		lineItems = new ArrayList<LineItem>();
	}
	
	public void addLineItem(LineItem lineItem) {
		lineItems.add(lineItem);
	}
	
	public ArrayList<LineItem> getLineItem() {
		return lineItems;
	}
	
	public double getTotal() {
		double invoiceTotal = 0;
		for (LineItem lineItem: lineItems) {
			invoiceTotal += lineItem.getTotal();
		}
		return invoiceTotal;
	}
	
	public String getTotalFormatted() {
		String priceFormatted = NumberFormat.getCurrencyInstance().format(getTotal());
		return priceFormatted;
	}

}
