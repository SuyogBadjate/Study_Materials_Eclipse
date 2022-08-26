package Lex_Courses.Programming_Fundamentals_using_Java;

public class stringFunc {

	public static void main(String[] args) {
		String firstName = "James";
		String lastName = "Bond";
		// find the number of characters in firstName
		System.out.println("Length of firstname: " + firstName.length());
		// use of + operator to concatenate strings
		String passengerName1 = firstName + lastName;
		System.out.println("Passenger Name: " + passengerName1);
		// use of concat method
		String passengerName2 = firstName.concat("BOND");
		System.out.println("Passenger Name: " + passengerName2);
		// to print the last name in lower case letters
		System.out.println(lastName.toLowerCase());
		System.out.println(lastName.toUpperCase());
		System.out.println(passengerName1.equals(passengerName2));
		System.out.println(passengerName1.equalsIgnoreCase(passengerName2));
        System.out.println(passengerName2.charAt(5));

}
}
