package Lex_Courses.Programming_Fundamentals_using_Java;

public class IterationStrEx3 {
	public static void main(String[] args) {
		int n=1,sum=1;
		
		while(n<10) {
			System.out.println(sum);
			sum+=sum;
			n++;	
		}
	}

}
