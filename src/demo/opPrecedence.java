package demo;

public class opPrecedence {

	public static void main(String[] args) {
		int num1=10,num2=20,num3=30,num4=40,num5=50;
		System.out.println(num1+num2/num3);
		System.out.println((num1+num2)/num3);
		System.out.println(num1+num2*num4-num5/num3);
		System.out.println(((num1+num2)*num4-num5)/num3);
		System.out.println(num1++ - num2 * 7 / --num2 + num1 * 10);

	}
}
