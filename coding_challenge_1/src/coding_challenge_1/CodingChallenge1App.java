package coding_challenge_1;

public class CodingChallenge1App {

	public int makeChocolate(int small, int big, int goal) {
		// make package of chocolate with small bars (1 kilo) and big bars (5 kilos).  Return number of small 
		// bars to use, big bars before small bars. Return -1 if it can't be done.
		// makeChocolate(4, 1, 9)-4
		// makeChocolate(4, 1, 10)-1
		// makeChocolate(4, 1, 7)-2
			if ((small + big * 5) < goal) {
				return -1;
			}
			else if ((big * 5) > goal) {
				return goal % 5;
			}
			
			else {
				return goal - big * 5;
			}
	}

}
