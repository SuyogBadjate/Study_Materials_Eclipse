package Lex_Courses.Programming_Fundamentals_using_Java;

public class MethodEx2isLeap {

	public static boolean isLeapYear(int year) {
		// Write your logic here to complete the code
		if((year%4==0)&&(year%100!=0 || year%400==0))
		  return true;
		else
			return false;
	}
	public static void main(String[] args) {
		boolean res = isLeapYear(2004);
		if (res) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
	}
}
