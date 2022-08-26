package Lex_Courses.Programming_Fundamentals_using_Java;

public class ArrAndMethodsAss1 {
	
	public static void main(String[] args) {
		int[] score= {281,344,265,272,236,324,287};
		int sum=0,avg=0,abvAvgScoreCount=0,belAvgScoreCount=0,equalAvgScoreCount=0;
		for(int ele:score) {
			sum+=ele;
		}
		avg=sum/score.length;
		System.out.println("The average score of the team is "+avg+" runs");
		for(int i=0;i<score.length;i++) {
			if(score[i]>avg)
				abvAvgScoreCount++;
			else if(score[i]==avg) 
				equalAvgScoreCount++;
			else
				belAvgScoreCount++;
		}
		System.out.println("No. of matches having score above average is "+abvAvgScoreCount);
		System.out.println("No. of matches having score equal to average is "+equalAvgScoreCount);
		System.out.println("No. of matches having score below average is "+belAvgScoreCount);

	}
	

}
