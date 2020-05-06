package ArrayMethod;

import java.util.ArrayList;
import java.util.Collections;

public class RandomNum {

	public static void main(String[] args) {
		ArrayList<Double> num = new ArrayList<Double>();
		
		for (int i = 0; i < 100; i++) {
			num.add(Math.random() * 100);
		}
		
		Collections.sort(num);
		
		double sum = 0.0;
		for(double value: num) {
			sum += value;
		}
		double ave = sum / 100;
		
		System.out.println("Average: " + ave);
		System.out.println("Median: " + num.get(50));
		for (int i = 9; i < 100; i += 9) {
			System.out.println("Position: " + i + "\t" + num.get(i));
		}
	}
}
