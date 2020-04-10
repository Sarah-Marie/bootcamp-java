
public class ContactAPP {

	public static void main(String[] args) {
		
		//Welcome
		System.out.println("Welcome to the Contact List application");
		
		// note we are skipping the continue loop to save time
		
		//Get user input: firstName, lastName, Email, Phone (all strings)
		
		String fn = Console.getString("Enter first name:  ");
		String ln = Console.getString("Enter last name:  ");
		String e = Console.getString("Enter email:  ");
		String pn = Console.getString("Enter phone:  ");
		
		//Do biz logic: Create an instance of Contact
		Contact c = new Contact(fn, ln, e, pn);
		
		//Display results: Current Contact display- per specs
		System.out.println(c.displayContact());
		
		//bye
		System.out.println("Bye");
		
		
	
		
		
	}

}
