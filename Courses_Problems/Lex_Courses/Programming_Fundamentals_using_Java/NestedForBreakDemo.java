package Lex_Courses.Programming_Fundamentals_using_Java;

public class NestedForBreakDemo {
	public static void main(String[] args) {
		for(int x=1; x<=3; x++){
			for(int y=1; y<=4; y++){
				if(y%2==0){ 
					break; //inner loop will terminate when this statement is executed and the control will go to outer loop
				}
				System.out.println("Value of x:" + x + " ---- " + "Value of y:" + y);
			}
		}
	}
}

