package db;

import business.Product;

public interface ProductReader {
	
	Product getProduct(String code);
	String getProducts();
}
