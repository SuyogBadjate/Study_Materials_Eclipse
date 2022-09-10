package Lex_Courses.Programming_Fundamentals_using_Java;

class Automobile {
	private float mileage=5.5f;
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
}
class Car3 extends Automobile {
	private String model;
	public Car3(String string) {
		// TODO Auto-generated constructor stub
		this.model=string;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void start() {
		System.out.println(model + " which gives " + getMileage() + " mileage/km is started");// here mileage variable of parent class is accessed directly
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car = new Car3("Hyundai");
		car.start();
	}

}
