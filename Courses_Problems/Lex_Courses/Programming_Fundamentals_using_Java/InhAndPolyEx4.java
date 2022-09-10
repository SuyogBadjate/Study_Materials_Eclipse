package Lex_Courses.Programming_Fundamentals_using_Java;

class Employee1{
	private int empId;
	private String name;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
class PermanentEmployee extends Employee1{
	private double basicPay;
	private double hra;
	private int experience;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void calculateSalary() {
		int varComponent=0;
		if(experience>=3 && experience<5)
			varComponent=5;
		else if(experience>=5 && experience<10)
			varComponent=7;
		else if(experience>=10)
			varComponent=12;
		setSalary(varComponent+basicPay+hra);
		
		System.out.println("Permanent Employee: Your salary is: "+getSalary());
	}
}
class ContractEmployee extends Employee1{
	private double wages;
	private int hours;
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void calculateSalary() {
		setSalary(hours*wages);
	    System.out.println("Contract Employee: Your salary is: "+getSalary());
	}
	
	
	
}
public class InhAndPolyEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee obj=new PermanentEmployee();
		ContractEmployee obj1=new ContractEmployee();
		obj.setName("Anil");
		obj.setEmpId(101);
		obj.setBasicPay(10000);
		obj.setHra(1500);
		obj.setExperience(3);
		obj.calculateSalary();
		
		obj1.setName("Ankit");
		obj1.setEmpId(102);
		obj1.setWages(500);
		obj1.setHours(10);
		obj1.calculateSalary();
		

	}

}
