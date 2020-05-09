package EnumMethod;

public class ShippingClass {
	
	static ShippingType secondDay = ShippingType.UPS_NEXT_DAY; // var secondDay the UPS_SECOND_DAY const
	public static double getShippingAmount(ShippingType st) { // accepts enum is a parameter
		double shippingAmount = 2.99;
		if (st == ShippingType.UPS_NEXT_DAY) { // Compares the constant (st) with two constants in enum to determine shippingAmt
			shippingAmount = 10.99;
		} else if (st == ShippingType.UPS_SECOND_DAY) {
			shippingAmount = 5.99;
		}
		return shippingAmount;
	}

	double shippingAmount = getShippingAmount(ShippingType.UPS_SECOND_DAY); // Statement that passes UPS_SECOND_DAY const to the getShippingAmt method
	// double shippingAmount 2 = getShippingAmount(1); Not allowed, can't use int in place of enum, prevents coders from just typing const name/value
	// A good practice to always code enums if const is required
	
	
}
