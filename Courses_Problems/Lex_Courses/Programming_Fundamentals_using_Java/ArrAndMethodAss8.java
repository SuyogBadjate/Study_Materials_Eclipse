package Lex_Courses.Programming_Fundamentals_using_Java;

public class ArrAndMethodAss8 {

	public static String findOccurencesOfString(String[] arr, String str) {
		boolean flag=false;
		for(String st:arr) {
			if(st.equals(str))
				flag=true;		
		}
		return flag?"The string is found":"The string is not found";
	}
	
	public static void main(String[] args) {
		String[] str={"Ruby","Pearl","Emerald","Sapphire"};
		System.out.println(findOccurencesOfString(str, "Pearl"));
	}
}
