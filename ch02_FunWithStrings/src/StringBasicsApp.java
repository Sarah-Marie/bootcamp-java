import java.util.Scanner;

public class StringBasicsApp {

	public static void main(String[] args) {
		String message = "Hello there";
		String emptyString = "";
		String nullString = null;
		
		String firstName = "Bob";
		String lastName = "Marley";
		String fullName = firstName+" "+lastName;
		
		String fullName2 = "";
		fullName2 += firstName;
		fullName2 += " ";
		fullName2 += lastName;
		System.out.println(fullName2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something:");
		String msg = sc.nextLine();
		System.out.println("You entered: "+msg);
		
		System.out.println("Hello....\nGeorge McFly");
		
		System.out.println("println adds a line break...");
		System.out.println("print does not");
		System.out.println("...case in point");
		
		sc.close();
		
		
		

	}

}
