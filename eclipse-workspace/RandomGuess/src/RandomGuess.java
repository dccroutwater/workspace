// Dylan Croutwater
// 8/26/2024
// The filename is RandomGuess. 

import javax.swing.JOptionPane;

/** 
 * 
 * The purpose is to get a random number from user and tell how close their choice is. 
 */

public class RandomGuess {

	public static void main(String[] args) {
		int numberToGuess = 1 + (int)(Math.random() * 10);
		System.out.println("The random number is: " + numberToGuess);
		String userInput = JOptionPane.showInputDialog("Think of a number between 1 and 10:");
		int userChoice = Integer.parseInt(userInput);
		String outputMessage = "";
		if (userChoice == numberToGuess) {
			outputMessage = "You are correct!";
		} else if (userChoice > numberToGuess) {
			outputMessage = "Your number is too large.";
		} else {
			outputMessage = "Your number is too small.";
		}
		
		JOptionPane.showMessageDialog(null,outputMessage);

	}

}
