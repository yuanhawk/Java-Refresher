package db;

import business.*;

public class EmployeeDB implements EmployeeReader, DepartmentConstants {
	
	@Override
	public Employee getEmployee(String name) {
		Employee employee = new Employee();
		
		employee.setName(name);
		if (name.equalsIgnoreCase("John Smith")) {
			employee.setDept(EDITORIAL);
			employee.setDesc("Murach's Java Programming");
		}
		return employee;
	}

}
