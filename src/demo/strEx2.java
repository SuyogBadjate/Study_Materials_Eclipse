package demo;

public class strEx2 {

	static String compareStr(String str1,String str2) {
		return str1.equalsIgnoreCase(str2)?"The strings are equal":"The strings are not equal";
	}
	public static void main(String[] args) {
	    System.out.println(compareStr("Flying","FLYing"));
	    System.out.println(compareStr("beautiful","beautiful"));
	    System.out.println(compareStr("Good","day"));

	}

}
