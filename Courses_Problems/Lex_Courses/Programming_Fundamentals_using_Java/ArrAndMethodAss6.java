package Lex_Courses.Programming_Fundamentals_using_Java;

public class ArrAndMethodAss6 {

	public static int findFactorial(int number) {
		int fact=1;
		if(number==0 || number==1)
		   return fact;
		else 
		   return number*findFactorial(number-1);
	}
	
	public static int[] findStrongNumbers(int[] numArrays) {
		int count=0;
		for(int i:numArrays) {
			int rem=0,sum=0;
			int j=i;
			while(j>0) {
			   rem=j%10;
			   sum+=findFactorial(rem);
			   j=j/10;
			   
			}
			if(i==sum && i!=0 && i!=1)
			    count++;
		}
		int[] result=new int[count];
		int j=0;
		for(int i:numArrays) {
			int rem=0,sum=0;
			int k=i;
			while(k>0) {
			   rem=k%10;
			   sum+=findFactorial(rem);
			   k=k/10;  
			}
			if(i==sum && i!=0 && i!=1)
				result[j++]=i;
		}
		return result;
	}
	public static void main(String[] args) {
		int numArray[] = {405,405,1,120};
		int[] result=findStrongNumbers(numArray);
		if(result.length==0){
		      System.out.println("{}");
		}
		else {
		System.out.print("{");
		for(int i=0;i<result.length&&result.length>0;++i)
		{
		   if(i<result.length-1) {
              System.out.print(result[i]+",");
           }
		   if(i==result.length-1) {
		      System.out.println(result[i]+"}");
		   }

		}
		}
	}

}
