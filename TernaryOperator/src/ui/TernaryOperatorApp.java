package ui;

public class TernaryOperatorApp {

	public static void main(String[] args) {
		// red light green light... what to do?
		System.out.println("Red Light Green Light Game");
		
		String lightColor = "green";
		System.out.println("Light Color is: "+lightColor);
		String action = "";
		
		
		
		/// set the action based on lightColor
		// if/else example
		//if (lightColor.equalsIgnoreCase("red")) {
			//action = "stop";
		//}
		//else {
			///action = "go";
			
		//}
		
		// ternary operator example
		action = lightColor.equalsIgnoreCase("red") ? "STOP" : "GO";
		System.out.println("Action is: "+action);
	}

}
