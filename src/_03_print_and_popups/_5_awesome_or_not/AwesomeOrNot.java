package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String [] args) {

		Random ran = new Random();    //This will be used below to make a random number. 

		// 2. Make a variable that will hold a random whole number
		int randomNumber=ran.nextInt(4);

		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 

		// 3. Print your variable to the console
		System.out.println(randomNumber);
		// 4. Get the user to enter something that they think is awesome
		String prompt = "Enter something awesome.";
		// 5. If your variable is  0
		if (randomNumber==0) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog (null, "Wow, that was awesome."); 
		}
		// 6. If your variable is  1
		if (randomNumber==1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, "That was ok."); }
			// 7. If your variable is  2
if (randomNumber==2) {
			// -- tell the user whatever they entered is boring.
JOptionPane.showMessageDialog(null,  "That was very boring."); }
			// 8. If your variable is  3
if (randomNumber==3) {
			// -- invent your own message to give to the user (be nice).
JOptionPane.showMessageDialog(null,  "Wow. That was truly amazing. Even though I am a computer, unable to feel any emotion, I was blown away by your statement."); }
		}
	}