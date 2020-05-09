package ObjectMethod;

public class AbstractMethod {

	/* abstract classes cannot be instantiated, but can be inherited fr, so to create an obj, create a subclass, and create the obj
	 *  
	 * abstract methods in an abstract class must be overriden
	 * 
	 * Function of abstract class - implement methods common to all table models, but leaves few abstract methods that are specific
	 * to the table that the subclass defines
	 */
	
	public abstract class Product {
		private String code, desc;
		private double price;
		
		// regular constructors & methods for instance var
		
		@Override
		public String toString() {
			return desc;
		}
		
		public abstract String getDisplayText();
	}
	
	public class Book extends Product {
		private String author;
		
		// regular constructors & methods for the Book class
		
		@Override
		public String getDisplayText() { // implement the abstract method
			return super.toString() + " by " + author;
		}
	}
	
	// final method - no overriding, rarely used
}
