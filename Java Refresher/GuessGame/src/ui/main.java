package ui;

import math.numberChecker;

public class main {
	
	public static void main(String[] args) {
		//Title
		console.displayLine("Welcome to Guess Game");
		console.displayLine();
		
		//Greetings
		String name = console.getString("What is your name?");
		console.displayLine("Greetings, " + name);
		console.displayLine();
		
		//Guess
		String choice = console.getString("Would you like to start the game? (y/n): ");
		int x = numberChecker.getRandomInt();
		
		while(choice.equalsIgnoreCase("y")) {
			int c = 0;
			int b = 5;
			int i;
			//Rule using for loop
			for(c = 5; c > 1; c--) {
				int a = b - c + 1; 
				i = console.getInt("Guess a whole number (1-20), you have " + c + " tries remaining");
				String getReply = numberChecker.getReply(i,x);
				console.displayLine(getReply);
				
				if (i == x) {
					console.displayLine("You have won in attempt " + a);
					break;
				}
			}
			if (c == 1) {
				int a = b - c + 1; 
				i = console.getInt("Guess a whole number (1-20), you have " + c + " try remaining. Treasure this last chance.");
				String getReply = numberChecker.getReply(i,x);
				console.displayLine(getReply);
				if (i == x) {
					console.displayLine("You have won in attempt " + a);
					break;
				}
				
				//Game over statement
				if (i != x) {
					console.displayLine("Game Over. Try again\n");
				}
			}
			choice = console.getString("Continue? (y/n): ");
		}
	}

}
