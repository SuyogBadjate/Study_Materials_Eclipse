package Lex_Courses.Programming_Fundamentals_using_Java;

class Employee2{
	private int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		if(point<=100 && point>=1)
		  this.point = point;
	}
	
}
class PerformanceRating{
	static final private int Outstanding=5;
	static final private int Good=4;
	static final private int Average=3;
	static final private int Poor=2;
	
	public int getOutstanding() {
		return Outstanding;
	}

	public int getGood() {
		return Good;
	}

	public int getAverage() {
		return Average;
	}

	public int getPoor() {
		return Poor;
	}

	public static int calculatePerformance(Employee2 employee) {
		if(employee.getPoint()<=100 && employee.getPoint() >=80)
			return Outstanding;
		else if(employee.getPoint()<=79 && employee.getPoint() >=60) {
			return Good;
		}
		else if(employee.getPoint()<=59 && employee.getPoint() >=50) {
			return Average;
		}
		else {
			return Poor;
		}
	}

}
public class InhAndPolyEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee2 obj1=new Employee2();
        obj1.setPoint(89);
        System.out.println(PerformanceRating.calculatePerformance(obj1));
        Employee2 obj2=new Employee2();
        obj2.setPoint(59);
        System.out.println(PerformanceRating.calculatePerformance(obj2));
        Employee2 obj3=new Employee2();
        obj3.setPoint(49);
        System.out.println(PerformanceRating.calculatePerformance(obj3));
	}

}
