package Lex_Courses.Programming_Fundamentals_using_Java;

public class ArrAndMethodsAss3 {

	public static int[] findEvenArray(int []numArray) {
    	int counter=0;
	    for(int i:numArray) {
	      if(i%2==0) counter++;
	    }
	    int evenArray[]=new int[counter];
	    int j=0;

	    for(int i:numArray)
	    {
	      if(i%2==0)
	        evenArray[j++]=i;
	    }
	    return evenArray;
	}
	
	public static void main(String args[]) {
	     int numArray[] = {4,36,10,33,22};
	     int evenNumArray[] = null;
	     evenNumArray=findEvenArray(numArray);
	     if(evenNumArray.length==0){
	       System.out.println("{}");
	       System.exit(0);
	     }
	     System.out.print("{");
	     for(int i=0;i<evenNumArray.length&&evenNumArray.length>0;++i)
	     {
	       if(i<evenNumArray.length-1) {

	       System.out.print(evenNumArray[i]+",");

	       }
	       if(i==evenNumArray.length-1) {
	       System.out.println(evenNumArray[i]+"}");
	       }

	     }
    }
	
}

