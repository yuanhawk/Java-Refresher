package InterfaceMethod;

import java.awt.print.Printable;

public interface Printer {
	
	// Implements static method
	static void print(Iprintable p) {
		p.print();
	}

	/* Calling a static method from an interface
	Printable product = new Product("java", "Murach's Java Programming", 57.50);
	Printer.print(product)
	*/
}
