
public class PersonManagerApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Person Manager!");

		// --Continue prompt start

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// Get user input: type (customer or employee) firstName, lastName, Customer number or ssn (all strings)
            String type = Console.getString("Create customer or employee? (c/e):  ",
            		                        "c", "e");
			String fn = Console.getString("Enter first name:  ", true);
			String ln = Console.getString("Enter last name:  ", true);
			

			// Do biz logic: Create an instance of Person
			Person p; 
			if (type.equalsIgnoreCase("c")) {
				//if person is a customer
				String custNbr = Console.getString("Customer Number:    ", true);
				Customer c = new Customer(fn,ln,custNbr);
				p = c;
				
			}
			else {
				// person is an employee
				String ssn = Console.getString("SSN:    ",true);
				Employee e = new Employee(fn,ln,ssn);
				p = e;
			}

			// Display results: 
			System.out.println();
			System.out.println("You entered a new "+p.getClass().getName());
			System.out.println(p.toString());
			System.out.println();
			

			
			choice = Console.getString("Continue? (y/n):  ", "y", "n");
			System.out.println();
			
			// -- Continue prompt end
		}

		// bye
		System.out.println("Bye!");

	}

}
