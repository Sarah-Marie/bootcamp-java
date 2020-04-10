import java.io.*;

public class ResourcesTesterApp {

	public static void main(String[] args) {
		String s1 = readLineWithResources();
		String s2 = readLineWithFinally();
	}

	private static String readLineWithFinally() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String readLineWithResources() {
        System.out.println("Starting readLineWithResources() method.");

        try {
            BufferedReader in = new BufferedReader(
                    new FileReader("products.txt")) {
            String s = in.readLine();
            return s;
        } catch (FileNotFoundException e) {
        	
        }
            
            catch (IOException e) {
            System.out.println("I/O error occurred.");
            return null;
        }
    }

	public static String readLineWithFinally() {
        System.out.println("Starting readLineWithFinally() method.");

        try {

            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader("products.txt"));
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
        }
}
	}
}