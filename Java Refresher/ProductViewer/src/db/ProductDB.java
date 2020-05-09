package db;

import business.*;

public class ProductDB {
	
	public static Product getProduct(String code) {
		Product product = null;
		if (code.equalsIgnoreCase("java") || code.equalsIgnoreCase("jsp") || code.equalsIgnoreCase("mysql")) {
			Book book = new Book();
			if (code.equalsIgnoreCase("java")) {
				book.setCode(code);
				book.setDesc("Murach's Java Programming");
				book.setPrice(57.50);
				book.setAuthor("Joel Murach");
			} else if (code.equalsIgnoreCase("jsp")) {
				book.setCode(code);
				book.setDesc("Murach's Java Servlets and JSP");
				book.setPrice(57.50);
				book.setAuthor("Mike Urban");
			} else if (code.equalsIgnoreCase("mysql")) {
				book.setCode(code);
				book.setDesc("Murach's MySQL");
				book.setPrice(54.50);
				book.setAuthor("Joel Murach");
			}
			product = book;
		} else if (code.equalsIgnoreCase("eclipse")) {
			Software software = new Software();
			software.setCode(code);
			software.setDesc("Eclipse");
			software.setPrice(0.0);
			software.setVersion("4.4.2");
			product = software;
		}
		return product;
	}

}
