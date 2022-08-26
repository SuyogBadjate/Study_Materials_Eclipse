package Lex_Courses.Programming_Fundamentals_using_Java;

public class TypeConversionDemo {

	public static void main(String[] args) {
		  //Implicit Conversion
		  int totalMarks = 656;
		  float percentage = (totalMarks/800.0f) * 100; 
		  System.out.println(percentage);// Will print 82.0

		  //Explicit Conversion
		  int totalMarks1 = 656;
		  float percentage1 = ((float)totalMarks1 / 800) * 100; 
		  System.out.println(percentage1);// Will print 82.0
	
		  int totalMarks2 = 656;
		  //int percentage2 = ((float)totalMarks2 / 800) * 100;  //results in an error
		  //System.out.println(percentage2);
	}
}
