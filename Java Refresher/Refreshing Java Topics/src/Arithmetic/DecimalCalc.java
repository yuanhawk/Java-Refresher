package Arithmetic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalCalc {

	//Solves rounding problems
	public static void main(String[] args) {
		BigDecimal subtotal = new BigDecimal("100.05"); //Creating object fr BigDecimal class
		BigDecimal discountPercent = new BigDecimal(".1");
		BigDecimal discountAmount = subtotal.multiply(discountPercent);
		discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP); //Round to 2 dp
		BigDecimal totalBeforeTax = subtotal.subtract(discountAmount);
		System.out.println(totalBeforeTax);
	}
}
