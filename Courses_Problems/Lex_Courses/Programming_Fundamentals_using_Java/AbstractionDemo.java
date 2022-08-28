package Lex_Courses.Programming_Fundamentals_using_Java;

class Car1{
	private String name;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car1(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Started");
	}
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name+"\tColor: "+color);
	}
	
	
}
public class AbstractionDemo {
	public static void main(String args[]) {
		Car1 shelby = new Car1("GT 350", "Black");
		Car1 agera = new Car1("Agera R", "Red");
		// Abstraction by invoking the methods of Car class
		shelby.start();
		agera.displayDetails();                               
       }

}
