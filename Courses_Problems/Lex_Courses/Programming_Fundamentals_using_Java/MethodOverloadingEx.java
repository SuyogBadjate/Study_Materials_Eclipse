package Lex_Courses.Programming_Fundamentals_using_Java;

class Point{
	private double x;
	private double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	Point(){
		
	}
	public double distance() {
		
		return Math.sqrt((x*x)+(y*y));
	}
	public double distance(Point point) {
		return Math.sqrt(((point.x-x)*(point.x-x))+((point.y-y)*(point.y-y)));
	}
}
public class MethodOverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point obj=new Point();
		obj.setX(2);
		obj.setY(3);
		System.out.printf("%.2f",obj.distance());
		
		System.out.println();
		
		Point obj1=new Point();
		obj1.setX(5);
		obj1.setY(6);
		System.out.printf("%.2f",obj1.distance(obj));

	}

}
