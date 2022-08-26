package Lex_Courses.Programming_Fundamentals_using_Java;

/*The code for an output like:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
using nested loops will be:
*/
public class NestedLoopDemo {
	public static void main(String[] args) {
		for(int row=1; row<=4; row++){ //outer loop
			for(int value=1; value<=5; value++){ //inner loop
				System.out.print(value + " ");
			}
			System.out.println(); //new line
		}
	}
}