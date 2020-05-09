package InterfaceMethodHierarchy;

public interface ProductDAO extends ProductReader, ProductWriter, ProductConstants {
	// hierarchy of interface, extending with more methods, the constants & methods of the interface
	
	/* An interface can inherit 1 >= other interfaces by specifying the inherited interfaces in an extends clause
	 * An interface can't inherit a class
	 * A class that implements an interface must implement all abstract methods declared by the the interface + inherited interfaces, unless the class is abstract
	 * A class that implements an interface can use the declared constants of the interface + inherited interface
	 */
}
