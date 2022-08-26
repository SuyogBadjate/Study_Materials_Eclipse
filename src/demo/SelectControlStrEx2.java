package demo;

public class SelectControlStrEx2 {

	static int maxOfThree(int num1,int num2,int num3) {
		if(num3>num1 && num3>num2)
			return num3;
		else
			return num1>num2 && num2<num3 ? num1 : num2;
		
	}
	public static void main(String[] args) {
		System.out.println(maxOfThree(45,88,10));
	}
}
