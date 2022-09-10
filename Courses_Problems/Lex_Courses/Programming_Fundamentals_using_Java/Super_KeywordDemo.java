package Lex_Courses.Programming_Fundamentals_using_Java;

class Driver6 {
    private String name;
    private double salary;
    protected String uniqueId;    // Driving License number
    public Driver6(String name, String licenseNo) {
        this.name = name;
        this.uniqueId = licenseNo;
    }
    public void calculateSalary() {    // Driver's caluclateSalary
        this.salary = 10000.0f;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}
class TaxiDriver extends Driver6 {

	private int noOfRides;
    private String uniqueId;    // Employee ID of the driver    
    public TaxiDriver(String name, String licenseNo, int noOfRides) {
       super(name, licenseNo);    //  passing parameters to the parent constructor
       this.noOfRides = noOfRides;
    }
    public void display() {
        System.out.println("License Number: " + super.uniqueId);    // Accessing parent variable of the same name
        System.out.println("Driver's Employee ID: " + this.uniqueId);
    }
    public void calculateSalary() {    // TaxiDriver's calculateSalary
        super.calculateSalary();
        double salary =  getSalary() +  this.noOfRides * 300;
        setSalary(salary);
        System.out.println(salary);
    }
}

public class Super_KeywordDemo{
	public static void main(String[] args) {
		TaxiDriver obj=new TaxiDriver("Rajesh", "105DAS", 5);
		obj.display();
		obj.calculateSalary();
	}
	
}
