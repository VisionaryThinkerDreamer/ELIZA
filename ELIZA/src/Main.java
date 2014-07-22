import java.util.Random;

import javax.swing.JOptionPane;

public class Main
{
	static String answer;
	static int randomNumber;

	public static void main(String[] args)
	{
		randomNumber = ((int) (Math.random() * 10));
		answer = JOptionPane
				.showInputDialog("Let's begin. Would you please tell me your name?");
		JOptionPane.showInputDialog("Oh, so your name is " + answer
				+ "? Okay, it's nice to meet you " + answer + ".");
		if (randomNumber == 6 || randomNumber == 2 || randomNumber == 3 || randomNumber == 5 )
		{
			JOptionPane.showInputDialog("Your name sucks though.");
			
		}
	}
}

/*
 * Declare a string variable (for making a variable, which is for holding
 * things) String name here; int name here boolean name here double name here
 */

