package Test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		double[] grades = {92.3, 88.0, 95.2, 90.5};
		double[] percentage = Arrays.copyOf(grades, 4);
		
		if (grades == percentage) {
			System.out.println("Both variables refer to the same arrays");
		} else {
			System.out.println("Both variables refer to different arrays");
		}
		
		if (Arrays.equals(grades, percentage)) {
			System.out.println("Both arrays have the same values");
		} else {
			System.out.println("Both arrays have different values");
		}
	}

}
