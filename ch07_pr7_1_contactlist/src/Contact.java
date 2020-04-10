import java.util.Scanner;

public class Contact {

	public static void main(String[] args) {
		private static Scanner sc = new Scanner(System.in);

	    public void String getString(FirstName) {
	        System.out.print("Enter first name");
	        String s = sc.next();  
	        sc.nextLine(); 
	        return s;
	    }
	    public void String getString(LastName) {
	        System.out.print("Enter last name");
	        String s = sc.next();  
	        sc.nextLine();  
	        return s;
	    }
	    
	    public void String getString(Email) {
	        System.out.print("Enter email address");
	        String s = sc.next();  
	        sc.nextLine();  
	        return s;
	    }
	    
	    public void int getInt(phone, int min, int max) {
	    	System.out.println("Enter Phone Number");
	        int i = 0;
	        boolean isValid = false;
	        while (!isValid) {
	            i = getInt(prompt);
	            if (i <= min) {
	                System.out.println(
	                        "Error! Number must be greater than " + min + ".");
	            } else if (i >= max) {
	                System.out.println(
	                        "Error! Number must be less than " + max + ".");
	            } else {
	                isValid = true;
	            }
	        }
	        return i;
	    }
	}

	
	// continue? y/n
}
