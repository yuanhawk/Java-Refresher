package LambdaMethod;

public class MathOperation {
	
	public static void main(String[] args) {
		MathOperation mathOperation = new MathOperation(); // instance of Class
		
		Operation addition = (int a, int b) -> a + b; // Lambda
		Operation subtraction = (a, b) -> a - b;
		Operation multiplication = (a, b) -> {return a * b;};
		
		System.out.println(mathOperation.method(10, 5, addition)); // Calls method
		System.out.println(mathOperation.method(10, 5, subtraction));
		System.out.println(mathOperation.method(10, 5, multiplication));
		
	}
	
	public static int method(int a, int b, Operation operation) { // Calls method of functional interface
		return operation.operate(a, b);
	}

}
