package Lex_Courses.Programming_Fundamentals_using_Java;

public class IterationStrEx1 {
	
	static void sumOfNNumbers(int n) {
		int sum=0;
		while(n>0) {
			sum+=n;
			n--;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		sumOfNNumbers(1);
	}

}
