// Class is a space in which you can save lots of data which includes variable , methods , constructors , block , interfaces etc .
// Lets take one example of Class :- The TATA Group 

class TATA {
	
	// Class contains constructors.
	// Bombay House is the headquarters of TATA Group.
	TATA (){
		System.out.println("Welcome to the Bombay House the headquarters of TATA Group ");
		int builtIn = 1924; 
	}

	// Class Contains Strings.
	// Founder of Tata group is Jamsetji Tata .
	String founder = "Jamsetji Tata";

	// Class contains variables 
	// TATA Group has over 935,000 Employees and 30 companies .
	int employees = 935000;
	short noOfCompanies = 30;
	long capitalisation = 26300000000000L;

	// Class contains methods .
	// Tata Group includes Tata Motors.
	static void tataMotors(){
		String tataMotors = "Tata Motors , Connecting Asperations";
		String range = "Works in wide range of cars, SUVs, buses, trucks, pickups and defence vehicles ";
		int vehiclesSold = 1086734; 
	
	}
}

class Companies {

	public static void main(String[] args){
		TATA obj = new TATA();
		
		System.out.println("Tata group includes : ");
		System.out.println("No of Employees = "+obj.employees);
		System.out.println("No of Companies = "+obj.noOfCompanies);
		System.out.println("Capitalisation = "+obj.capitalisation);

		TATA.tataMotors();
	}

}
