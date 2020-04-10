package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pet;
import util.Console;

public class PetStoreApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Pet Store App!");
		System.out.println();
		System.out.println(
				"This application will manage a list of pets. You can add pets to the inventory & remove them when they get adopted.");

		String command = "";

		// - Start loop
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();

			// Get user input
			command = Console.getString("Command?: ", true);

			// Do business logic

			// Display results
			switch (command) {
			case "list":
				listPets();
				break;
			case "add":
				addPet();
				break;
			case "adopt":
				adoptPet();
				break;
			case "exit":
				// do nothing-exit
				break;
			default:
				System.out.println("Invalid Entry. Try again.");
				break;
			}
			// -end loop
		}

		// Good-bye

		System.out.println("Bye");
	}
	

	private static void addPet() {
		// prompt user for pet info
		int id = Console.getInt("Pet ID:  ", 0, (int) Double.POSITIVE_INFINITY);
		String type = Console.getString("Type? ", true);
		String species = Console.getString("Species? ", true);
		String name = Console.getString("Name? ", true);
		int age = Console.getInt("Age? ", 0, (int) Double.POSITIVE_INFINITY);

		Pet p = new Pet(0, type, species, name, age);
		Pet.add(p);

		// display confirmation message
		System.out.println("Pet added!");

	}

	private static void listPets() {
		// get list of pets
		List<Pet> pets = new ArrayList<>();
		Pet p1 = new Pet(1, "Cat", "Domestic Short Hair", "Dora", 16);
		Pet p2 = new Pet(2, "Dog", "Yellow Lab", "Arlo", 5);

		petsList.list(pets);

	}

	
 
	private static Pet adoptPet() {
		Pet adoptPet;
		Pet p = adoptPet;
		while (p == null) {
			int id = Console.getInt("Pet ID: ", 0, (int) Double.POSITIVE_INFINITY);
			p = Pet.adopt(id);
			System.out.println();
		

		return p;

		// display confirmation message
		System.out.println("Pet adopted!");
		System.out.println();
	}

	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("list   - List all pets\n");
		menu.append("add    - Add a pet\n");
		menu.append("adopt    - Adopt a pet\n");
		menu.append("exit   - Exit the Program\n");
		System.out.println(menu);
	

}

} }
