package en;

public enum CustomerType implements CustomerTyper {

	// Always store enums in a separate folder, so that you can import the package as static
	
	RETAIL,
	TRADE,
	COLLEGE;
	
	@Override
	public String toString() {
		String s = "";
		if (ordinal() == 0) {
			s = "RETAIL";
		} else if (ordinal() == 1) {
			s = "TRADE";
		} else if (ordinal() == 2) {
			s = "COLLEGE";
		}
		return s;
	}
}
