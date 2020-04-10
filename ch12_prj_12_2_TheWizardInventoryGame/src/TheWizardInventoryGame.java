
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import UTIL.Console;

public class TheWizardInventoryGame {
	private static List<String> items = new ArrayList<>();

	public static void main(String[] args) {
		
		// Welcome
		System.out.println("Welcome to The Wizard Inventory Game!"); 
		
		
		
		
		
		
		// inventory initialization of 3 items
		//demonstrating use of 'addAll' method
		
		
		String[] itemsArray = {"Wooden Staff", "Wizard Hat", "Cloth Shoes"};
		items.addAll(Arrays.asList(itemsArray));
		
		// -begin loop & loop back to the command menu
		String command = "";
		
		while (!command.equalsIgnoreCase("exit"))
		// display menu
			displayMenu();
		
		
		
		// get user input: command : String
		command = Console.getString("Command: ", true);
		
		//Business logic
		
		//SWITCH statement
		switch (command) {
		case "show":
			showItems();
		break;
		case "grab":
			addItems();
		break;
		case "edit":
			editItems();
		break;
		case "drop":
			dropItems();
		break;
		case "exit":
			
		break;
		default:
			
		}
		System.out.println();
		
		// bye
		System.out.println("Finis");
	}
	

	private static void dropItems() {
		// prompt for the number then drop it
		int itemNumber = Console.getInt("Number: ", 0, items.size()+1);
		String droppedItem = items.remove(itemNumber - 1);
		System.out.println(droppedItem+ " was dropped.");
		
		
	}

	private static void editItems() {
		// prompt for number
		int itemNumber = Console.getInt("Number: ", 0, items.size()+1);
		String updatedName = Console.getString("Updated name: ", true);
		items.remove(itemNumber - 1);
		items.add(itemNumber - 1, updatedName);
		System.out.println("Item number "+itemNumber+" was updated.");
		
	}

	private static void addItems() {
		// We can only hold 4 items at a time
		// dispaly msg if already at max limit
		if (items.size() >=4) {
			System.out.println("Cannot grab an item.  Max limit (4) reached.");
		}
		else  {
			String itemName = Console.getString("Name: ", true);
			items.add(itemName);
			System.out.println(itemName+" was added.");
		}
		
	}

	private static void showItems() {
		// list all items
		for (int i = 0; i < items.size(); i++) {
			// item # will be 1 more than index (i)
			int itemNbr = i + 1;
			System.out.println(itemNbr+". "+items.get(i));
		}
		
	}

	

	
	

	{


	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU");
		menu.append("show - Show all items\n");
		menu.append("grab - Grab an item\n");
		menu.append("edit - Edit an item\n");
		menu.append("drop - Drop an item\n");
		menu.append("exit - Exit program\n");
		System.out.println(menu);
	
}
}
