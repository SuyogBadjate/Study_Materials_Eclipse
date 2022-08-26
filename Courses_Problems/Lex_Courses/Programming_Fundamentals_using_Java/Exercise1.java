package Lex_Courses.Programming_Fundamentals_using_Java;

public class Exercise1 {

	static long calculateSimpleInterest(int p,int r,int t) {
	long si=0;
	si = p * r * t /100;
	return si;
	}
	
	public static void main(String[] args) {
	
		System.out.println(calculateSimpleInterest(2500,3,3));
	}
	
	
}
