package MainMethod;

public class CodeTesterApp {
	
	public static void main(String[] args) {
		
		String string;
		
		String productCode = "java";
		double price = 49.5;
		int quantity = 2;
		double total;
		
		total = price * quantity;
		
		string = "Welcome to the Code Tester\n\n"
				+ "Code:\t\t"+ productCode + "\n"
				+ "Price:\t\t"+ price + "\n"
				+ "Quantity:\t" + quantity + "\n"
				+ "Total:\t\t" + total + "\n\n"
				+ "Bye!";
		
		System.out.println(string);
		
	}

}
