package db;

import en.CustomerType;

public interface CustomerReader {
	
	double getDiscountPercent(CustomerType type);
	double getDiscountType(String type);
	CustomerType getType(String type);

}
