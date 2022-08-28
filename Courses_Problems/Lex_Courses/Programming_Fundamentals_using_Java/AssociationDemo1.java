package Lex_Courses.Programming_Fundamentals_using_Java;

class Driver{
	private String name;
	private String licenseNumber;
	public String getName() {
		return name;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public Driver(String name, String licenseNumber) {
		super();
		this.name = name;
		this.licenseNumber = licenseNumber;
	}
	public void driveCar(Car2 car) {
		System.out.println(car.getModel());
		car.start();
		car.move();
		car.stop();
	}
	
}
class Car2 {
    private String model;

	public String getModel() {
		return model;
	}

	public Car2(String model) {
		super();
		this.model = model;
	}
    public void start() {
    	System.out.println("Started");
    }
    public void stop() {
    	System.out.println("Stopped");
    }
    public void move() {
    	System.out.println("moving");
    }
    
}

public class AssociationDemo1{
	public static void main(String[] args) {
		Driver obj=new Driver("Ajit", "ABC5286");
		Car2 obj2=new Car2("Hyundai");
		obj.driveCar(obj2);
		
		
	}
}
