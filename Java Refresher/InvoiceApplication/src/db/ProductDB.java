package db;

import static en.ProductType.*;
import en.ProductType;
import business.Product;

public class ProductDB implements ProductReader {

	public Product getProduct(ProductType type) {
		Product product = new Product();
		
		if (type == JAVA) {
			product.setCode("java");
			product.setDesc("Murach's Java Programming");
			product.setPrice(57.50);
		} else if (type == JSP) {
			product.setCode("jsp");
			product.setDesc("Murach's Java Servlets and JSP");
			product.setPrice(57.50);
		} else {
			product.setCode("xxxx");
			product.setDesc("unknown");
			product.setPrice(0.0);
		}
		return product;
	}
	
	public Product getProduct(String code) {
		Product product = new Product();
		
		if (code.equalsIgnoreCase("java")) {
			product = getProduct(JAVA);
		} else if (code.equalsIgnoreCase("jsp")) {
			product = getProduct(JSP);
		} else {
			product.setCode("xxxx");
			product.setDesc("unknown");
			product.setPrice(0.0);
		}
		return product;
	}
}
