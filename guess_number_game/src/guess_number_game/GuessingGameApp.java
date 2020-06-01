package guess_number_game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		// This is a number guessing game from 1-10
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number from 1 to 10: ");
		
		int inputNumber = keyboard.nextInt();
		int randomNumber = new Random().nextInt(10) + 1;
		
		if (inputNumber == randomNumber)  {
			System.out.println("*********");
			System.out.println("*You win.*");
			System.out.println("**********");
		} else {
			System.out.println("You lose.");
			System.out.print("The random number was: ");
			System.out.println(randomNumber + ".");
		}
		System.out.println("Thank-you for playing!");
		
		keyboard.close();
	}
	

}
