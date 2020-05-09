package db;

import business.*;

public class ProductDB {

	public static Product getProduct(String code) {
		Product p = null;
		if (code.equalsIgnoreCase("sgtp")) {
			Album a = new Album();
			a.setCode(code);
			a.setDesc("Sgt. Peppers");
			a.setPrice(14.99);
			a.setArtist("The Beatles");
			p = a;
		}
		return p;
	}
}
