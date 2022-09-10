package Lex_Courses.Programming_Fundamentals_using_Java;

class Employee{
	private String name;
	private int score;
	private final int BASESALARY=15000;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int calculateFinalSalary(int score) {
		if(score>92)
			return BASESALARY+10000;
		else if(score>80)
			return BASESALARY+5000;
		else if(score>70)
			return BASESALARY+1000;
		else
			return 0;
		
	}
	
}
public class finalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee obj=new Employee();
        obj.setName("Vicky");
        obj.setScore(86);
        System.out.println("Hi "+obj.getName()+", your salary for this month will be Rs."+obj.calculateFinalSalary(obj.getScore()));
	}

}
