
public class DiceRollerApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Dice Roller!");
		
		// Get user input: roll die?: Y or y to continue
		String choice = Console.getString("Roll the dice? (y/n)");
		
		while (choice.equalsIgnoreCase("y")) {
			
		
		
		// Biz logic: sum the dice 
			
			Dice d =  new Dice();
			d.roll();
			
			
		// Think about classes you're going to use (class named Die and Dice)
		
		
		
		// Display results: Display total, msg
			d.printRoll();
		choice = Console.getString("Roll again? (y/n)");
		}
		
		// bye
		System.out.println("Bye!");

	}

}
