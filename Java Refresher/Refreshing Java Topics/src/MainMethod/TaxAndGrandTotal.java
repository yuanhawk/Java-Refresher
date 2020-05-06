package MainMethod;

public class TaxAndGrandTotal {

	public static void main(String[] args) {
		String code, desc, string;
		int quantity;
		double price, total, taxP, taxA, gTotal;
		
		code = "android";
		desc = "Murach's Android Programming";
		price = 57.5;
		quantity = 2;
		total = price * quantity;
		taxP = 7.5;
		taxA = taxP/100 * total;
		gTotal = total + taxA;
		
		string = "Code:\t\t" + code + "\n"
				+ "Description:\t" + desc + "\n"
				+ "Price:\t\t" + price + "\n"
				+ "Quantity:\t" + quantity + "\n"
				+ "Total:\t\t" + total + "\n"
				+ "Tax Percent:\t" + taxP + "\n"
				+ "Tax Amount:\t" + taxA + "\n"
				+ "Grand Total:\t" + gTotal;
		
		System.out.println(string);
		
	}
}
