package Lex_Courses.Programming_Fundamentals_using_Java;

public class NoOfChoclates_Purchased {

	static float noOfChoclatesPurchased(int count,float price) {
		return count*price;
	}
	public static void main(String[] args) {
		System.out.println(noOfChoclatesPurchased(3,2.5f));
	}
}
