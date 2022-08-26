package Lex_Courses.Programming_Fundamentals_using_Java;

public class AssItertion1 {
	
	static int factOfNumber(int n) {
		int fact=1;
		if(n>1) 
		  return n*factOfNumber(n-1);
		else 
		  return fact;
	}
	public static void main(String[] args) {
		System.out.println(factOfNumber(1));
	}

}
