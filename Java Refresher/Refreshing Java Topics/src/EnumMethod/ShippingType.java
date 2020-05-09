package EnumMethod;

public enum ShippingType {
	
	// Within the enum, code the names of 1/2 constants, separating each name with a comma
	
	UPS_NEXT_DAY, // value of 0
	UPS_SECOND_DAY, // value of 1
	UPS_GROUND; // value of 2

	/* Convention of storing enum in separate file so that enum is available to all classes within the app. So the file contains
	 * only enums
	 * 
	 * Most preferred way to store constants
	 */
	
	@Override
	public String toString() { // Normally the toString method would return the name of the constant
		String s = "";
		if (ordinal() == 0) {
			s = "UPS Next day (1 business day)";
		} else if (this.ordinal() == 1) {
			s = "UPS Second Day (2 business days)";
		} else if (this.ordinal() == 2) {
			s = "UPS Ground (5 to 7 business days)";
		}
		return s;
	// Enums can overrde methods from java.lang.Object & java.lang.Enum class
	}
}
