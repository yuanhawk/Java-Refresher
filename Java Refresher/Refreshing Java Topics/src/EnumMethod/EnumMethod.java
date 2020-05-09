package EnumMethod;

import static EnumMethod.ShippingType.*;

public class EnumMethod {

	/* Define a set of related constants, used to store related constants in a class or interface
	 * For eg, Rounding<ode is an enum of the Java API to set the rounding mode for a BigDecimal obj
	 * 
	 * It is possible to override methods that an enum inherits from java.lang.Object & java.lang.Enum
	 * 
	 * Static imports
	 * code a static import statement
	 * import static (...).*; - can be used for enums, class and can be used to refer to those static
	 * field and methods without qualification, but refrain from using it for class, cos thr might b confusion of
	 * naming conventions
	 * 
	 * 2 methods of an enum const
	 * name() - returns a String for the enum const's name
	 * ordinal() - returns an int value that corresponds to the enum const's position (order of position)
	 */
	
	public static void main(String[] args) {
		ShippingType ground = UPS_GROUND; // Don't need to write ShippingType.UPS_GROUND
		System.out.println("Shipping type: " + ground.toString());
	}
	
}
