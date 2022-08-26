package demo;

public class ArrayEx {
	public static void main(String[] args) {
		int[] arr= {11,22,33,44,55,66};
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		System.out.println(sum);
	}

}
