package Lex_Courses.Programming_Fundamentals_using_Java;

public class ArrAndMethodsAss2 {
	public static void main(String[] args) {
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		double sum=0,avg=0;
		int belAvgsalaryCount=0,abvAvgsalaryCount=0;
		for(double ele:salary) {
			sum+=ele;
		}
		avg=sum/salary.length;
		System.out.println("The average salary of the employee is "+avg);
		for(int i=0;i<salary.length;i++) {
			if(salary[i]>avg)
				abvAvgsalaryCount++;
			else if(salary[i]<avg) 
				belAvgsalaryCount++;
		}
		System.out.println("No. of employees having salary above average is "+abvAvgsalaryCount);
		System.out.println("No. of employees having salary below average is "+belAvgsalaryCount);

	}

}
