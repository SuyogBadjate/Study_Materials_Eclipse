package Lex_Courses.Programming_Fundamentals_using_Java;

public class AreaOfTrapezoidEx {

	static double area(int base1,int base2,int height) {
		return 0.5*(base1+base2)*height;
	}
	public static void main(String[] args) {
	    System.out.println(area(10,20,6));	
	}
}
