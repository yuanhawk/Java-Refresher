package ForLoop;

import java.util.ArrayList;

public class ForLoopMethod {
	
	public static void main (String[] args) {
		ArrayList<String> hello = new ArrayList<String>(); //implicit 10
		for (int i = 0; i < 3; i++) { // Normal for loop
			hello.add("Hello");
		}
		
		for (String s: hello) { // Enhanced-For
			System.out.println(s);
		}
	}

}
