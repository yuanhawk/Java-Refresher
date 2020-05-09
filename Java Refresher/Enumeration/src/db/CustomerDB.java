package db;

import static en.CustomerType.*;

import en.CustomerType;
import business.Customer;

public class CustomerDB implements CustomerReader{
	
	@Override
	public double getDiscountPercent(CustomerType type) {
		double discountPercent;
		if (type == RETAIL) {
			discountPercent = 0.1;
		} else if (type == TRADE) {
			discountPercent = 0.3;
		} else if (type == COLLEGE) {
			discountPercent = 0.2;
		} else {
			discountPercent = 0.0;
		}
		return discountPercent;
	}
	
	@Override
	public double getDiscountType(String type) {
		Customer customer = new Customer();
		customer.setType(type);
		
		double discountPercent;
		if (type.equalsIgnoreCase("retail")) {
			discountPercent = getDiscountPercent(RETAIL);
		} else if (type.equalsIgnoreCase("trade")) {
			discountPercent = getDiscountPercent(TRADE);
		} else if (type.equalsIgnoreCase("college")) {
			discountPercent = getDiscountPercent(COLLEGE);
		} else {
			discountPercent = 0.0;
		}
		return discountPercent;
	}
	
	@Override
	public CustomerType getType(String type) {
		CustomerType typer = null;
		if (type.equalsIgnoreCase("retail")) {
			typer = RETAIL;
		} else if (type.equalsIgnoreCase("trade")) {
			typer = TRADE;
		} else if (type.equalsIgnoreCase("college")) {
			typer = COLLEGE;
		} else {
			typer = null;
		}
		return typer;
	}

}
