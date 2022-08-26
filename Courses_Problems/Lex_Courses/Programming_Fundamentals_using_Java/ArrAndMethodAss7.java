package Lex_Courses.Programming_Fundamentals_using_Java;

import java.util.Iterator;

public class ArrAndMethodAss7 {
	public static int findOccurences(String word, char letter) {
		int count=0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)==letter)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int res=findOccurences("Relaxation", 's');
		System.out.println(res);
	}

}
