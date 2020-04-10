import java.util.Scanner;

public class TableofPowersApp2TableApp {

	public static void main(String[] args) {
		
		// welcome
		System.out.println("Welcome to the Squares and Cubes Table");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
		// prompt user input -n
			
		System.out.println("Enter an integar: ");
		int n = sc.nextInt();
		
		
		// Number, Squared, Cubed 
		String table = "";
		String header = "";
		header += "Number\tSquared\tCubed\n";
		header += "======\t=======\t=====\n";
		table += header;
		
		
		for (int i=1; i <=1; i++)  {
			//each loop will produce 1 line in our table
			int squared = i*i;
			int cubed = i*i*i;
			String row = i+"\t"+squared+"\t"+cubed+"\n";
			table += row;
		}
		
		System.out.println(table);
		System.out.println();
		System.out.print("Continue?");
		choice = sc.next();
		
		
		
		}
		
		
		
		
		
		
		
		
		// bye

		
		
		
		System.out.println("Goodbye");
		sc.close();
	}

}
