package Lex_Courses.Programming_Fundamentals_using_Java;

class InfyDanceRegistration{
	private static int counter;
	private String name;
	private long contactNumber;
	private String city;
	public String getName() {
		return name;
	}
	public InfyDanceRegistration(String name, long contactNumber, String city) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
	}
	static {
		counter = 10001;
	}
	public String generateRegistrationId() {
		return "D"+(counter++);
	}
}
public class OopsEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfyDanceRegistration infy=new InfyDanceRegistration("Frank", 9870745632L, "Kolkata");
		System.out.println("Hi "+infy.getName()+".Your registration Id is: "+infy.generateRegistrationId());
		InfyDanceRegistration infy2=new InfyDanceRegistration("Maya", 8878964509L, "Mysore");
		System.out.println("Hi "+infy2.getName()+".Your registration Id is: "+infy2.generateRegistrationId());

	}

}
