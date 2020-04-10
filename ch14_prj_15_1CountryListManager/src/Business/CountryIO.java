package Business;

import java.io.PrintWriter;
import java.util.List;

import UTIL.Console;

public class CountryIO {

	public static void main(String[] args) {

		
		
		// Welcome and Initialization
				System.out.println("Welcome to the Country List Manager");
				String command = "";
				
				// - Start loop
				while (!command.equalsIgnoreCase("exit")) {
					displayMenu();
		
		command = Console.getString("Enter Menu Number: ", true);

		// Do business logic

		// Display results
		switch (command) {
		case "get":
			getCountry();
			break;
		case "list":
			listCountry();
			break;
		case "add":
			addCountry();
			break;
		
		case "exit":
			// do nothing-exit
			break;
		default:
			System.out.println("Invalid Entry. Try again.");
			break;
		}

	

	
	PrintWriter out = new PrintWriter(
					  new BufferedWriter(
					  new FileWriter("country.txt", true)));
	
	CountryIO country;
	out.print(country.getCountry(Thailand) + "\t");
	out.println(country.getCountry());
	
	out.close();
	
				}
	
	
	
	
	
	
	
	// Good-bye
	
	private static void addCountry() {
		// prompt user for country
				String country = console.getString("Country");
				
				// add the country
				Country c = new Country("Enter Country:  ");
				
				// display confirmation message
				System.out.println("This country has been saved");
		
	}









	private static void listCountry() {
		// get list of all countries
				List<Country> country = country.list();
				
				// display to screen
				for (Country c: country) {
					System.out.println(c);
				}
		
	}









	private static void getCountry() {
		// prompt user for menu number and get country
				Country c = getIdAndReturnCountry();
				
				// display to screen
				System.out.println(c);
		
	}
	private static Country getIdAndReturnCountry() {
		Country c = null;
		while (c==null) {
			int id = Console.getString("Country");
			c = country.get(id);
			System.out.println();
		}
		
		return c;
	}





	
	public ArrayList<String> getCountry = new ArrayList<>("Canada", "United States", "Mexico");
	public boolean saveCountry(ArrayList<String> country);


	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("list   - List a country\n");
		menu.append("add    - Add a country\n");
		menu.append("exit   - Exit the Program\n");
		System.out.println(menu);
	}
}
