package ui;

public interface Displayable {
	
	String getName();
	String getDesc();
	String getDept();
	
	default String displayText() {
		return getName() + " (" + getDept() + ")\n" + getDesc(); 
	}
}
