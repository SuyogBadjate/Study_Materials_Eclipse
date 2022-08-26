package demo;

public class Select_ControlEx1 {

	public static void main(String[] args) {
		System.out.println(checkProduct(1,5,7));
	}
	
	static int checkProduct(int num1,int num2,int num3) {
		if(num1==7)
		  return num2*num3;
		else if(num2==7)
			return num3;
		else if(num3!=7)
			return num1*num2*num3;
		else
			return -1;
		
	
	}
	
	
}
