
public class Person {

	// 1. define instance variables: (In this class, we need: firstName and lastName)
	
		private String firstName;
		private String lastName;
		
		
		
		// 2. 'generate' (use ide)  constructors- always 2 of them: default (empty) & fully loaded
		public Person() {
			super();
		}


		public Person(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			
		}

		// 3. 'generate' (use ide) getters/setters

		public Person(String fn, String ln, String cn) {
			// TODO Auto-generated constructor stub
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		
		// define displayContact method
		
		


		@Override
		public String toString() {
		
			return "Name:   "+firstName + " " + lastName;
		}
		
		
		
	
	
	
}
