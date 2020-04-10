package UI;

import DB.CountryIO;
import UTIL.Console;

public class CountryListManagerApp {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("Welcome to the Country List Manager App");
		System.out.println();
		CountryIO countryIO = new CountryIO();
		int menuNbr = 0;

		while (menuNbr != 3) {

			// - start loop
			// display menu
			displayMenu();

			// get user input
			menuNbr = Console.getInt("Enter menu number: ", 0, 4);
			System.out.println();

			// business logic (get array list from inside country io and print out contentsp 486
			// display results
			switch (menuNbr) {
			case 1:
				for (String country: countryIO.getCountries()) {
					System.out.println(country);
					
				}
				System.out.println();
				break;
			
			case 2:
				String country = Console.getString("Enter Country:   ", true);
				countryIO.addCountry(country);
				System.out.println("This country has been saved");
				System.out.println();
				break;
				
			case 3:
				//do nothing exit app
				break;
			}
			
			// -end loop
		}

		// bye
		System.out.println("Bye");
	}

	
	private static void displayMenu() {
		System.out.println("Command Menu");
		System.out.println("1 - List Countries");
		System.out.println("2 - Add Countries");
		System.out.println("3 -  Exit");
		System.out.println();
	}
}
