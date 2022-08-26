package Lex_Courses.Programming_Fundamentals_using_Java;

public class currFlights {

	public static void main(String[] args) {
	    //Variable declaration
	    int landingsCount = 356;
	    int takeoffsCount = 245;
	    int initialFlights = 89;
	    int currentFlights = initialFlights + landingsCount - takeoffsCount;
	    //Displaying the current number of flights
	    System.out.println("Current number of flights:" + currentFlights);
	
	    System.out.println(landingsCount > takeoffsCount);

	    // Checking if number of landings and takeoffs are more than 100
	    System.out.println(landingsCount > 100 && takeoffsCount > 100);
	
	    float flightFare = 1090.95f;
		float taxAmount = 100.0f;
		// Displaying the flight fare
		System.out.println("Flight Fare:" + flightFare);
		// The below statement is equivalent to: flightFare = flightFare +
		// taxAmount
		flightFare += taxAmount;
		System.out.println("Flight Fare including tax:" + flightFare);
	
		System.out.println("Prefix operation");
		int iVal1 = 10;
		System.out.println(iVal1); // 10
		// first increment happens and then assignment
		int iVal2 = ++iVal1;
		System.out.println(iVal1); // 11
		System.out.println(iVal2); // 11
		System.out.println("Postfix operation");
		int iVal3 = 10;
		System.out.println(iVal3); // 10
		// first assignment happens and then increment
		int iVal4 = iVal3++;
		System.out.println(iVal3); // 11
		System.out.println(iVal4); // 10
		
		System.out.println("Number of landings : " + landingsCount);
		// On arrival of a flight, incrementing the landingsCount
		landingsCount++;
		System.out.println("Number of landings : " + landingsCount);
	
	}

}
