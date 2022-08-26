package demo;

public class NestedIf_demo {

	//To first check the ticket status and then calculate the charge for the ‘confirmed’ passengers alone

	public static void main(String[] args) {
		String ticketStatus = "Confirmed";
		int luggageWeight = 32;
		int weightLimit = 30; // Weight limit for the airline
		int extraLuggageCharge = 0;
		if (ticketStatus.equalsIgnoreCase("confirmed")) {
			if (luggageWeight > 0 && luggageWeight <= weightLimit) {
				System.out.println("Check-in cleared");
			} else if (luggageWeight <= (weightLimit + 10)) {
				extraLuggageCharge = 300 * (luggageWeight - weightLimit);
			} else {
				extraLuggageCharge = 500 * (luggageWeight - weightLimit);
			}
		}
		if (extraLuggageCharge > 0) {
			System.out.println("Extra luggage charge is Rs." + extraLuggageCharge);
		} else {
			System.out.println("Sorry, your ticket isn't confirmed!");
		}
	}
}
