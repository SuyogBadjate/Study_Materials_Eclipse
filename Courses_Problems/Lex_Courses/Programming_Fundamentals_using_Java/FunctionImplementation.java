package Lex_Courses.Programming_Fundamentals_using_Java;

public class FunctionImplementation {
//	public static void calculateNumberOfFlightsInAirport(int landingsCount, int takeoffsCount, int initialFlights){ //method signature with formal parameters {
//		int currentFlights = initialFlights + landingsCount - takeoffsCount;
//		// Displaying the current number of flights
//		System.out.println("Current number of flights:" + currentFlights);
//	}
	
	// This is a function to find the current number of flights in an airport and return it
		public static int calculateNumberOfFlightsInAirport
		(int landingsCount, int takeoffsCount, int initialFlights)
		//method signature with formal parameters
		{ 
			int currentFlights = initialFlights + landingsCount - takeoffsCount;
			// return the current number of flights to the calling method
			return currentFlights;
		}
		
		public static int calculateSum(int num1, int num2) {//num1 and num2 are formal parameters
			// adding the values passed as parameters
			int sum = num1 + num2; // sum is a local variable 
			// returning the value
			return sum;
		}
		
		public static void updateNumList(int[] items) {
			items[1] = 100;
			System.out.println("printing values in the function");
			// calling the function to print the values in array
			printList(items);
		}
		public static void printList(int[] list) {
			for (int num : list) {
				System.out.print(num);
				System.out.print('\t');
			}
			System.out.println();
		}
		
		public static String[] generateFlightNumbers() {
			// declaring an array to store the flight numbers
			String flightNumbers[] = new String[10];
			String flightNumber;
			// generating the flight number and storing it in the array
			for (int i = 0; i < 10; i++) {
				flightNumber = "FT" + (i + 1);
				flightNumbers[i] = flightNumber;
			}
			// returning the array
			return flightNumbers;
		}
		
	public static void main(String[] args) {
		int numberOfLandings = 356;
		int numberOftakeoffs = 245;
		int numberOfinitialFlights = 89;
		//calculateNumberOfFlightsInAirport(numberOfLandings, numberOftakeoffs, numberOfinitialFlights); //static methods can be invoked like this <classname>.<methodname>
		//static methods can be invoked like this <classname>.<methodname>
				int currentNoOfFlights =
						FunctionImplementation.calculateNumberOfFlightsInAirport
						(numberOfLandings, numberOftakeoffs, numberOfinitialFlights); 
				System.out.println("Current number of flights:" +currentNoOfFlights);
	
	
				int result = 0;		// result is a local variable 
				result = calculateSum(10, 20);//10 and 20 are actual parameters
				System.out.println(result);
		        result = calculateSum(90, 10);//90 and 10 are actual parameters
				System.out.println(result);
				
				
				int numList[] = { 10, 30, 20, 50 };		
				System.out.println("array values, before function call");
				// calling the function to print the values in array
				printList(numList);
				// calling the function and passing the array as reference
				updateNumList(numList);
				System.out.println("array values, after function call");
				// calling the function to print the values in array
				printList(numList);
				
				
				String[] flights;
				flights = generateFlightNumbers();
				// displaying the flight numbers
				for (String flight : flights) {
					System.out.println(flight);
				}
	}

}
