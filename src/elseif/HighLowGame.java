//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for(int x = 0; x < 10; x++) {
			// 1. ask the user for a guess using a pop-up window, and save their response 
String i = JOptionPane.showInputDialog("Guess a Number from 1-100");
		
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int r4ndomGuess = Integer.parseInt(i);
		
			// 5. if the guess is correct
			if(r4ndomGuess == random) {
				JOptionPane.showMessageDialog(null, "You Win!");
				System.exit(0);
			}
				// 6. win
			// 7. if the guess is high
			else if(r4ndomGuess > random) {
				JOptionPane.showMessageDialog(null,"Your guess is too high!");
					
				}
			else if(r4ndomGuess < random) {
				JOptionPane.showMessageDialog(null,"Your guess is too low!");
					
				}
		}
		JOptionPane.showMessageDialog(null,"You Lose!");
	}
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose

	}




