package Lex_Courses.Programming_Fundamentals_using_Java;

class Circle{
	private double radius;
	private double pi;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public void displayArea() {
		System.out.println("Area of Circle is: "+pi*radius*radius);
	}
}
public class constructorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle();
		obj.setPi(3.14);
		obj.setRadius(8);
		obj.displayArea();

	}

}
