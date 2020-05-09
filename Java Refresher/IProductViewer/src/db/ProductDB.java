package db;

import business.Product;

public class ProductDB implements ProductReader{
	
	@Override
	public Product getProduct(String code) {
		
		Product product = new Product();
		product.setCode(code);
		
		if (code.equalsIgnoreCase("java")) {
			product.setDesc("Murach's Java Programming");
			product.setPrice(57.50);
		} else if (code.equalsIgnoreCase("jsp")) {
			product.setDesc("Murach's Java Servlets and JSP");
			product.setPrice(57.50);
		} else if (code.equalsIgnoreCase("mysql")) {
			product.setDesc("Murach's MySQL");
			product.setPrice(54.50);
		} else {
			product.setDesc("Unknown");
		}
		return product;
	}
	
	@Override
	public String getProducts() {
		return "This method hasn't been implemented yet.";
	}

}
