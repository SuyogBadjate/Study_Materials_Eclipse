package Lex_Courses.Programming_Fundamentals_using_Java;

import java.util.Scanner;

public class AssItertion4 {

	public static void main(String[] args) {
		int id=1001;
		String initial="T";
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
		while(n>0) {
			System.out.println(initial+id++);
			n--;
		}
	}
	
}


