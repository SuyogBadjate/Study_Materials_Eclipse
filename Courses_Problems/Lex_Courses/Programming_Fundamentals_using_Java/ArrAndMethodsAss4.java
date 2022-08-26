package Lex_Courses.Programming_Fundamentals_using_Java;

public class ArrAndMethodsAss4 {
	
	public static int AdjacentEqualEleCount(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1])
				count++;	
		}
		return count;	
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4,4,4,10};
		System.out.println(AdjacentEqualEleCount(arr));
	}

}
