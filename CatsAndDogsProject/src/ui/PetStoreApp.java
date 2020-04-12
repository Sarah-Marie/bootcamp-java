package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pet;
import util.Console;

public class PetStoreApp {
	// this list should be defined as static instance variable
	private static java.util.List<Pet> pets = new ArrayList<Pet>();

	public void list() {
		pets = new ArrayList<Pet>();
	
	}

	

	public static void main(String[] args) {
		
		// these 2 statements should be atop the main method
		Pet p1 = new Pet(1, "Cat", "Domestic Short Hair", "Dora", 16);
		Pet p2 = new Pet(2, "Dog", "Yellow Lab", "Arlo", 5);
		// TODO declare list of pets
		
		pets.add(p1);
	 pets.add(p2);
		
		
		
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

			// switch statements
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
		// Pet.add(p);
		// TODO add p to list of pets

		// display confirmation message
		System.out.println("Pet added!");

	}

	private static void listPets() {
		
		for(Pet p : pets) {
			System.out.println(p);
	}
	}

	private static Pet adoptPet() {
		Pet adoptPet;
		Pet p = null;
		while (p == null) {
			int id = Console.getInt("Pet ID: ", 0, (int) Double.POSITIVE_INFINITY);
			p = Pet.adopt(id);
			System.out.println();
			// display confirmation message
						System.out.println("Pet adopted!");
						System.out.println();
			return p;

			
		}
		return p;

	}


	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("list   - List all pets\n");
		menu.append("add    - Add a pet\n");
		menu.append("adopt    - Adopt a pet\n");
		menu.append("exit   - Exit the Program\n");
		System.out.println(menu);

	}

}


