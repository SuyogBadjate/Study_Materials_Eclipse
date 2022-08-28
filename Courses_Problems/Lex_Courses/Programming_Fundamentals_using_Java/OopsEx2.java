package Lex_Courses.Programming_Fundamentals_using_Java;

class Trainee{
	private int traineeId;
	private Classroom classRoom;
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public Classroom getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(Classroom classRoom) {
		this.classRoom = classRoom;
	}
	public Trainee(int traineeId, Classroom classRoom) {
		super();
		this.traineeId = traineeId;
		this.classRoom = classRoom;
	}
	
	
	
}
class Classroom{
	private int noOfSeats;
	private String name;
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Classroom(int noOfSeats, String name) {
		super();
		this.noOfSeats = noOfSeats;
		this.name = name;
	}
	
	
}
class Admin1{
	private int adminId;
	private Classroom classRoom;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public Classroom getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(Classroom classRoom) {
		this.classRoom = classRoom;
	}
	public int allocate(Trainee trainee) {
		return classRoom.getNoOfSeats()-1;
	}
	public Admin1(int adminId, Classroom classRoom) {
		super();
		this.adminId = adminId;
		this.classRoom = classRoom;
	}
	
}
public class OopsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Classroom classroom = new Classroom(100, "G045");
        Admin1 admin1 = new Admin1(4243, classroom);
        Trainee trainee=new Trainee(1005, classroom);
        System.out.println("Number of seats left after allocating trainee "+trainee.getTraineeId()+" to the classroom is: "+admin1.allocate(trainee));
       	}
}
