import java.util.Scanner;

public class TableofPowersApp {

	public static void main(String[] args) {
		
		// welcome
		System.out.println("Welcome to the Squares and Cubes Table");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
		// prompt user input -n
			
		System.out.println("Enter an integar: ");
		int n = sc.nextInt();
		
		}
		// Number, Squared, Cubed 
		
		System.out.println("Number\tSquared\tCubed");
		System.out.println("======\t=======\t=====");
		
		for (int i=1; i <=1; i++)  {
			//each loop will produce 1 line in our table
			int squared = i*i;
			int cubed = i*i*i;
			System.out.println(i+"\t"+squared+"\t"+cubed);
		}
		
		
		System.out.println();
		System.out.print("Continue?");
		choice = sc.next();
		
		
		
		
		
		// biz logic
		
		
		
		// display output
		
		
		
		
		
		
		
		// bye

		
		
		
		System.out.println("Goodbye");
		sc.close();
	}
}

