package Lex_Courses.Programming_Fundamentals_using_Java;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		int count = 0;
		for (count = 0; count < 8; count++) {
			if (4 == count) {
				continue;
			}
			System.out.println(count);
		}
}
}
