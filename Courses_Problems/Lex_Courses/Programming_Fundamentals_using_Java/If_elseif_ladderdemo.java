package Lex_Courses.Programming_Fundamentals_using_Java;

public class If_elseif_ladderdemo {

	//To check the luggage weight and calculate charge for the extra luggage

	public static void main(String[] args) {
		int luggageWeight = 32;
		int weightLimit = 30; // Weight limit for the airline
		int extraLuggageCharge = 0;
		if (luggageWeight > 0 & luggageWeight <= weightLimit) {
			System.out.println("Check-in cleared");
		} else if (luggageWeight <= (weightLimit + 10)) {
			extraLuggageCharge = 300 * (luggageWeight - weightLimit);
		} else {
			extraLuggageCharge = 500 * (luggageWeight - weightLimit);
		}
		if (extraLuggageCharge > 0) {
			System.out.println("Extra luggage charge is Rs." + extraLuggageCharge);
		}
	}
}
