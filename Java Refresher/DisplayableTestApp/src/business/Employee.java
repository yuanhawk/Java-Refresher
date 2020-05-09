package business;

import ui.Displayable;

public class Employee implements Displayable {

	private String name, desc, dept;
	
	public Employee() {
		name = "";
		desc = "";
		dept = "";
	}
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
