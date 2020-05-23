package math;

import java.lang.Math;


public class numberChecker {
	//Random number generator
	public static int getRandomInt() {
		int x = (int)(Math.random() * 20);
		return x;
	}
	//Conditional Hint Statement
	public static String getReply(int i, int x) {
		String s = "";
		if (i > x) {
			System.out.print("Hint: Please guess smaller");
		} else if (i < x) {
			System.out.print("Hint: Please guess bigger");
		} else if (i == x) {
			System.out.print("Congrats for guessing the right number");
		}
		return s;
	}
}
