package ArrayMethod;

public class ArrayListMethod {
	
	/* Use ArrayList
	 * ArrayList<String> Name = new ArrayList<String>(); adjustable arrays, similar to python list
	 * 
	 * Differences: Arrays - fixed, ArrayList - able to resize
	 * Arrays - stores primitive types (int/double), ArrayList - collections use wrapper classes to store primitive types
	 * Arrays - does not have call methods, ArrayList - uses set/get methods to access the values
	 * 
	 * Collections automatically add/remove wrapper class - autoboxing
	 * 
	 * Downsides to ArrayList: inserting an element into the middle of a list is inefficient as the elements after the insertion pt
	 * must be removed to accommodate the inserted element
	 * 
	 * The <> are known as generics and specifes the element type for a collection, only adds obj of the specified type
	 * Auto cast any obj to the correct type
	 * 
	 * Since ArrayList uses wrapper classes, you will never see: <int> / <double>, for eg
	 * ArrayList<int> numbers = new ArrayList<int>(); //illegal
	 * 
	 * If you need a large capacity for the ArrayList, specify the capacity in the ()
	 * 
	 * ArrayList<E>() - default capacity: 10 elements / ArrayList<E>(intCapacity)
	 * 
	 * add(obj) - Adds obj to the end of the list
	 * add(index, obj) - Adds the obj at the specified index pos
	 * get(index) - Returns the obj at the specified index pos
	 * size() - Returns the num of elements in the list
	 * 
	 * clear() - Remove all elements fr the list
	 * contains(obj) - Returns true if specified obj is in the list
	 * indexOf(obj) - Returns the index pos of the specified obj
	 * isEmpty() - Returns true if the list is empty
	 * remove(index) - Removes the obj at the specified index pos & returns that obj
	 * remove(object) - Removes specified obj - returns a boolean value & indicates whether the operation was successful
	 * set(index, obj) - Sets the element at the specified index to the specified obj
	 * toArray() - Returns an array containing the elements of the list
	 */

}