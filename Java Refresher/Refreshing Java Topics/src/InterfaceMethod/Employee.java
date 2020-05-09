package InterfaceMethod;

public class Employee implements Iprintable, DepartmentConstants{ //implement multiple interfaces
	
	private int department;
	private String firstName, lastName;
	
	public Employee(int department, String lastName, String firstName) {
		this.department = department;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	/* Code that passes an Employee obj to the method
	Employee employee = new Employee(DepartmentConstants.EDITORIAL, "Murach", "Joel");
	printMultiple(employee, 1)
	*/
	
	// A class that implements an interface can use any constant defined by that interface
	/*@Override
	public void print() { // Provide an implementation for each method defined by the interface, if forget to implement a method defined, compiler will issue an error msg
		String dept = "Unknown";
		if (department == ADMIN) {
			dept = "Admininstration";
		} else if (department == EDITORIAL) {
			dept = "Editorial";
		} else if (department == MARKETING) {
			dept = "Marketing";
		}
		System.out.println(firstName + " " + lastName + " (" + dept + ")");
	}*/

}
