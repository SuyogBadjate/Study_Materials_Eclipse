package Lex_Courses.Programming_Fundamentals_using_Java;

class Demo {
	final int TENURE= 0;
	double principal;
	float interestRate;
	String accountNumber;
	final double calculateEMI(){
		return 2000;
	}
}
class Demo2 extends Demo{
  // Error as  final method is overriding
//  double calculateEMI(){
//		return 8000;
//	} 
}	
class Circle1 {
	// Java program to find area of circle
    private int radius;
    private double area;
    private final double PI = 3.14;
    public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPI() {
		return PI;
	}	
    public Circle1(int radius){
        this.radius = radius;
    }	
	public void calculateArea() {
        area = PI * radius * radius;		
	}  
}
public class finalKeywordDemo {

	public static void main(String[] args) {
		final int WORKINGHOURS = 8;//finalVariableDemo
		System.out.println("Working Hours in 5 days = " + WORKINGHOURS * 5);
		
		Circle1 circle = new Circle1(5);
		circle.calculateArea();
		System.out.println("Area is " + circle.getArea());
		
		Demo d = new Demo();
		//d.TENURE= 1;		//Error as tenure is final 
		System.out.println(d.TENURE);
		System.out.println(d.calculateEMI());
	}
}
