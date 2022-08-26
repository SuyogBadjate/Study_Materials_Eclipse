package Lex_Courses.Programming_Fundamentals_using_Java;

public class ArrAndMethodAss5 {
	
		public static boolean isLeapYear(int year) {
			// Write your logic here to complete the code
			if((year%4==0)&&(year%100!=0 || year%400==0))
			  return true;
			else
				return false;
		}
		
		public static int[] findLeapYearList(int[] yearArray) {
			int count=0;
			for(int i:yearArray) {
				if(isLeapYear(i))
					count++;
			}
			int[] result=new int[count];
			int j=0;
			for(int i:yearArray) {
				if(isLeapYear(i))
					result[j++]=i;
			}
			return result;
		}
		public static void main(String[] args) {
			int yearArray[] = {2013,2015,1621,2019,2014};
			int[] result=findLeapYearList(yearArray);
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
