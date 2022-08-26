package demo;

public class AssItertion2 {
	public static void main(String[] args) {
		int number=42,rem=0,sum=0;
		while(number>0) {
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println(sum);
	}

}
