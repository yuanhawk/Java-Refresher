package db;

import static en.ProductType.*;

import en.ProductType;

import business.*;

public class ProductDB implements ProductGettable {
	
	public LineItem getLineItem(ProductType type) {
		LineItem lineItem = new LineItem();
		if (type == JAVA) {
			lineItem.setCode("java");
			lineItem.setDesc("Murach's Java Programming");
			lineItem.setPrice(57.50);
		} else if (type == JSP) {
			lineItem.setCode("jsp");
			lineItem.setDesc("Murach's Java Servlets and JSP");
			lineItem.setPrice(57.50);
		}
		return lineItem;
	}
	
	public LineItem getLineItem(String code) {		
		LineItem lineItem = new LineItem();
		lineItem.setCode(code);
		if (code.equalsIgnoreCase("java")) {
			lineItem = getLineItem(JAVA);
		} else if (code.equalsIgnoreCase("jsp")) {
			lineItem = getLineItem(JSP);
		} else {
			lineItem.setCode("unknown");
			lineItem.setDesc("unknown");
			lineItem.setPrice(0.0);
		}
		return lineItem;
	}

}
