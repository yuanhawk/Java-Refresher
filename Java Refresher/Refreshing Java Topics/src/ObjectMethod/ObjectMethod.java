package ObjectMethod;

import GetterSetter.Product;

public class ObjectMethod {
	
	/* java.lang.Object
	 * toString() - returns String object containing class name, followed by the @ symbol, followed hexadecimal representation of the has code
	 * equals(Object) - returns true if var refers to the same obj
	 * getClass() - returns Class obj that represents the type of obj
	 * clone() - returns a copy of object as an Object
	 * hashCode - returns an int value that represents the hash code for the obj
	 * 
	 *  It's recommended to override the toString method so that it returns a concise string
	 *  
	 *  Access modifers
	 *  private - available within current class
	 *  public - available to classes in all packages
	 *  protected - available to classes in the same package and to subclass
	 *  w/o access modifier - available to classes in the same package
	 *  
	 *  @Override - annotation for overriding a method
	 *  
	 *  if (p instanceof Book) {
	 *  	syso("This is a Book obj");
	 *  }
	 *  Checks obj type
	 *  
	 *  Product p1 = new Product();
	 *  Product p2 = p1;
	 *  if (p1.equals(p2)) - true
	 *  
	 *  Product p1 = new Product();
	 *  Product p2 = new Product();
	 *  if (p1.equals(p2)) - false
	 *  to test if 2 obj var refer to same obj, use the equal method of the obj class
	 */
	
	// to test if 2 obj store the same data, override the equals method to test all instance var in the 2 objs are equal
/*	@Override
	public boolean equals(Object object) {
		if (object instanceof Product) {
			Product product2 = (Product) object;
			if (code.equals(product2.getCode())) &&
				description.equals(product2.getDesc()) &&
				price == product2.getPrice()) {
					return true;
			}
		}
		return false;
	}
*/
}
