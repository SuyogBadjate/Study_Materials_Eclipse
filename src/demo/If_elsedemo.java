package demo;

public class If_elsedemo {

	//To check if the ticket is confirmed (using a case insensitive comparison) 
	public static void main(String[] args) {
		String ticketStatus = "Confirmed";
		// case-insensitive comparison of the ticket status
		if (ticketStatus.equalsIgnoreCase("confirmed")) {
			System.out.println("Boarding Allowed!");
		} else {
			System.out.println("Sorry, your ticket isn't confirmed!");
		}
	}
}
