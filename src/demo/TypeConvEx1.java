package demo;

public class TypeConvEx1 {

	static void areaOfCircle(int r) {
		System.out.printf("%.2f",(3.14*r*r));
		System.out.println();
		System.out.println((int)3.14*r*r);

	}
	public static void main(String[] args) {
		areaOfCircle(2);
		areaOfCircle(3);

	}
}
