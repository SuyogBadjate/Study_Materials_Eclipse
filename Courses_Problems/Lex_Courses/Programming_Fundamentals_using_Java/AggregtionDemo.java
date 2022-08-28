package Lex_Courses.Programming_Fundamentals_using_Java;

class Address {
	private String streetName;
	private String cityName;
	private String state;
	private int pinCode;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
class Student {
	private String studentName;
	private int age;
	private Address address;
	/*
	 * Here within Student class Address class is used a instance variable i.e.
	 * Each and every student object will have a address within it Student
	 * "has-a" address. "Aggregation relationship"
	 */
	private double courseFee;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
}
public class AggregtionDemo {
	public static void main(String[] args) {
		
	}

}
