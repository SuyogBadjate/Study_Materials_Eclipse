package demo;

public class LeapYearEx {

	static String LeapOrNot(int year) {
		if(year%4==0 && (year%100!=0 || year%400 == 0))
			   return "It is a leap year";
		else
		       return "It is not a leap year";
		
	}
	public static void main(String[] args) {
		System.out.println(LeapOrNot(2200));
	}
}
