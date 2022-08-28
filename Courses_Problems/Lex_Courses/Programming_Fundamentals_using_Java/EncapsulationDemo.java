package Lex_Courses.Programming_Fundamentals_using_Java;
//Encapsulation in Java
class Car {
	// private member variables
	private String model;
	private String color;
	private float mileage;
	// public getter and setter methods
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object for Car class
		Car bmw = new Car();
		// setting a value for the color attribute using setter method
		bmw.setColor("Black");
		// displaying the value for the color attribute using getter method
		System.out.println(bmw.getColor());

	}

}
