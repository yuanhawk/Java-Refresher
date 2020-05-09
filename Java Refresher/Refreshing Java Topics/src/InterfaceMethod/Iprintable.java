package InterfaceMethod;

public interface Iprintable {
	/* type CONSTANT_NAME = value; static const
	 * returnType methodName([parameterList]);
	 */
	default void print() { // method is automatically public and abstract
		System.out.println(toString()); //default methods - can be implemented by a class, and it isn't required to override it. Override it when needed.
	}
	// Most common use is to state a contract that needs to be done, needs to be implemented in classes that implement the Iprintable interface
	// aka method declaration
}

/*
public interface ProductWrite { - all methods are public & abstract
	boolean add(Product p);
	boolean update(Product p);
	boolena delete(Product p);
}

public interface DepartmentConstant { - all fields are public, static & final
	int ADMIN = 1;
	int EDITORIAL = 2;
	int MARKETING = 3;
}

public interface Serializable { - tagging interface, used to identify that an obj is safe for certain type of operation: cloning/serialising
}
*/