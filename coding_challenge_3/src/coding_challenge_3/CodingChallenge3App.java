package coding_challenge_3;

import java.util.Scanner;

public class CodingChallenge3App {

	public static void main(String[] args) {
		// Arrowhead- use control statements to create an arrow.  User input determines arrow size.
		
		//prompt user input
		System.out.println("Hello!  How many arrows would you like?");
		Scanner scan = new Scanner(System.in);
		int numOfArrows = scan.nextInt();
		
		for(int i = 1; i <= numOfArrows; i++) {
			for(int j = 0; j< i; j++) {
				System.out.print(">");
			}
			System.out.println();
		}
		
		for(int i = numOfArrows - 1; i > 0; i--) {
			for(int j = 0; j< i; j++) {
				System.out.print(">");
			}
			System.out.println();
		}

	}

}
