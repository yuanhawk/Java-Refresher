package db;

import business.Product;
import en.ProductType;

public interface ProductReader {
	
	Product getProduct(ProductType type);
	Product getProduct(String code);
	
}
