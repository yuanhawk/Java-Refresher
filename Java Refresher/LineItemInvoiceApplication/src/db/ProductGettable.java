package db;

import business.LineItem;
import en.ProductType;

public interface ProductGettable {
	
	LineItem getLineItem(ProductType type);
	LineItem getLineItem(String code);

}
