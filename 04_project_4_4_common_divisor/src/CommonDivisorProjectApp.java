import java.util.Scanner;

public class CommonDivisorProjectApp {

	public static void main(String[] args) {
		// Welcome
		
		System.out.println("Welcome to the Greatest Common Divisor App");
		
		Scanner sc = new Scanner(System.in);
		String choice = "Y";
		
		
		
		// -while loop begins
		
		while (choice.equalsIgnoreCase("y")) {
		
		// Get user input -x, y
		System.out.println("Enter first number (x):    ");
		int x = sc.nextInt();
		System.out.println("Enter first number (y):    ");
		int y = sc.nextInt();
		
		
		
		
		// Do biz logic - euclidean algorithm
		// do this until x == 0
		while (x > 0)  {
			while (y >= x) {
				// subtract x from y
				y -= x;
			}
			// swap values of x and y
			int hold = y;
			y = x;
			x = hold;
		}
		
		// y should be the gcd
		
		//  display ouput - gcd
		System.out.println("Greatest common divisor: "+y);
		System.out.println();
		
		
		// -while loop ends
		
		System.out.println("Continue?   ");
		choice = sc.next();
		System.out.println();
	}
		//  bye
       
		System.out.println("Bye");
		sc.close();
	}

}
