package LambdaMethod;

public class StringConcatenation {
	
	public static void main(String[] args) {
		StringOperation so = (String s, String t) -> System.out.println(s + " " + t); // Create a function fr interface
		
		so.operate("Marcus", "Tan"); // interface method
	}
}
