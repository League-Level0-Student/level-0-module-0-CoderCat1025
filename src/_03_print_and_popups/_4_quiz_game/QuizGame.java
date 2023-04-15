package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2.  Ask the user a question 
		String prompt = "What color is the sky?";
		String answer = JOptionPane.showInputDialog(prompt);
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equals ("Blue")) {
			// 4.  if the user's answer was correct, add one to their score 
			score+=1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer


		String prompt2 = "What is floccinaucinihilipilification?";
		String answer2 = JOptionPane.showInputDialog(prompt2);
		if (answer2.equals("The estimation of something or someone as useless")); {
			score+=1;}
		// After all the questions have been asked, tell the user their final score 
 JOptionPane.showMessageDialog(null, "Your score was " +score+ " out of 2.");
	}
}