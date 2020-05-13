package LambdaMethod;

import java.util.List;
import java.util.function.Predicate;

public class LambdaMethod {
	
	/* Lambda expressions - similar to a method in an anonymous class, eliminate the enclosing method & anon class
	 * lambda expression passes the functionality of a method as a parameter, aka anon functions
	 * 
	 * Lambda expressions are anon functions that can be passed as arguments to methods
	 * Allows one to treat the functions like data
	 * 
	 * Benefits: Reduce code duplication, write methods that are more flexible and easier to maintain
	 * Drawbacks: don't work well with debugger, can be inefficient, result in stack traces that are difficult to understand
	 * Result in code that's difficult to understand, result in code duplication for commonly used functionality
	 * 
	 * function
	 * 1. Name
	 * 2. Parameter*
	 * 3. Body*
	 * 4. Return
	 * 
	 * Thread th = new Thread(***new Runnable() { // Name which is redundant, use lambda to skip the name
	 * 		public void run()*** {
	 * 			System.out.println("In another thread");
	 * 		}
	 * });
	 * 
	 * th.start();
	 * 
	 * Thread th;
	 * th = new Thread(() -> Syso("In another thread"));
	 * 
	 * Choose Lambda > Anon Class (No extra anon classes created on disk, memory footprint, less garbage collected, runtime would become better)
	 * Lambda uses invokeDynamic
	 * 
	 * java.util.function
	 * Utilising Predicate interface
	 * Defines a method named test that works much like the test method in the TestContact functional interface
	 */
	
	/* TestContact Interface
	public List<Contact> filterContactsWithoutPhone(List<Contact> contacts) {
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}
		return contactsWithoutPhone;
	}
	
	vs
	
	public static List<Contact> filterContacts(List<Contact> contacts, *Predicate<Contact> condition*) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
	*/
	
	/*
	List<Contact> contactsWithoutPhone = filterContactsWithoutPhone(contacts); // Filter contacts that don't have phone no.
	for (Contact p: contactsWithoutPhone) { // print contacts to console
		System.out.println(p.getName());
	}
	vs
	
	List<Contact> contactsWithoutPhone = filterContacts(contacts,
			c -> c.getPhone() == null); // skips through the name of the function & calls the method directly
	*/
	
	/* Predicate interface that's available from the java.util.function package
	public interface Predicate<T> { - a functional interface can only contain one method
		boolean test (T t);
	}
	*/
	
}
