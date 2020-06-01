package coding_challenge_2;

public class ClosingChallenge2App {

	public static void main(String[] args) {
		// FizzBuzz
		for(int i = 1; i <= 100; i++) {
			if(i % (3*5) == 0) System.out.println("FizzBuzz");
			else if(i % 3 == 0) System.out.println("Fizz");
			else if(i % 5 == 0) System.out.println("Buzz");
			else System.out.println(i);
		}

	}

}
