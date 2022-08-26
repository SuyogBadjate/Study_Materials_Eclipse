package Lex_Courses.Programming_Fundamentals_using_Java;

public class ArrayDemo {
	public static void main(String[] args) {
		// Example 1:
		int[] marksOfStudents = new int[3];
		// Example 2:
		int[] empNumbers;
		empNumbers = new int[5];
		// Example 3:
		int[] leapYears = {2000,2004,2008,2012};
		// Example 4:
		String[] empNames = new String[]{"Mary", "John", "Jack"};
		
		int[] marksOfStudents1 = new int[3];
		marksOfStudents1[0] = 85;  // elements can be updated and accessed with the help of index
		marksOfStudents1[1] = 65;
		marksOfStudents1[2] = 90;
		System.out.println(marksOfStudents1[1]);
		
		int[] marksOfStudentsName = { 85, 65, 90 };
		for (int index=0  ; index<marksOfStudentsName.length ; index++) { 
			System.out.println(marksOfStudentsName[index]);
		}
		
		//Enhanced for loop
		int[] marksOfStudents2 = { 85, 65, 90 };
		for (int mark : marksOfStudents2) {
			System.out.println(mark);
		}
		
		// declaring an array to store the flight numbers
		String flightNumbers[] = new String[10];
		// generating the flight number and storing it in the array
		for (int i = 0; i < 10; i++) {
			flightNumbers[i] = "FT" + (i + 1);
		}
		// displaying the flight numbers
		for (String flight : flightNumbers) {
			System.out.println(flight);
		}
		

	}

}
