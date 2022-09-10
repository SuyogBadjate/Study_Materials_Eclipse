package Lex_Courses.Programming_Fundamentals_using_Java;

class Automobile1 { // Parent class
	private float mileage;	
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}	
	public void start() { // Implementation of start() method in Parent class
		System.out.println("Automobile is started");
	}
}
class Car4 extends Automobile1 {
	private String model;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void start() {// Overriden method implementation of start() in Child class
		System.out.println("Car is started");
	}
}
class Bus extends Automobile1 {
	public void start() {// Overriden method implementation of start() in Child class
		System.out.println("Bus is started");
	}
}
class Driver2 {
	public void driveVehicle(Automobile1 vehicle) { // method takes parent class reference as parameter
		// depending on the automobile type appropriate start method is invoked
		vehicle.start();
	}
}
public class methodOverridingDemo {
    public static void main(String[] args) {
    	Driver2 driver = new Driver2(); 
		Car4 car = new Car4(); //Creating car object
		Bus bus = new Bus(); //Creating bus object
        //Driver class driveVehcile() method takes Automobile reference as parameter
		driver.driveVehicle(car); //Passing car object to driveVehicle
		driver.driveVehicle(bus); //Passing bus object to driveVehicle
    }
}
