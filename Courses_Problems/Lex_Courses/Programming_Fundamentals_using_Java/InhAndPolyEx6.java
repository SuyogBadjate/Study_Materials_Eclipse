package Lex_Courses.Programming_Fundamentals_using_Java;

class EventRegistration{
	private String name;
	private String nameOfEvent;
	private double registrationFee;
	public EventRegistration(String name, String nameOfEvent) {
		super();
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	public void registerEvent() {
		switch(getNameOfEvent()) {
		case "ShakeALeg":
			registrationFee=100;
			break;
		case "Sing&Win":
			registrationFee=150;
			break;

		case "Actathon":
			registrationFee=70;
			break;

		case "PlayAway":
			registrationFee=130;
			break;

		default:
			System.out.println("Please choose a valid Event");
				
		}
	}
}
class SingleEventRegistration extends EventRegistration{
	private int participantNo;

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

	public SingleEventRegistration(String name,String nameOfEvent,int participantNo) {
		super(name,nameOfEvent);
		this.participantNo = participantNo;
	}
	public void registerEvent() {
		switch(getNameOfEvent()) {
		case "ShakeALeg":
			setRegistrationFee(100);
			System.out.println("Thank you "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+getParticipantNo());	
			break;

		case "Sing&Win":
			setRegistrationFee(150);
			System.out.println("Thank you "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+getParticipantNo());	
			break;

		case "PlayAway":
			setRegistrationFee(130);
			System.out.println("Thank you "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+getParticipantNo());	
			break;

		default:
			System.out.println("Please choose a valid Event");	
		}
	}
	
}
class TeamEventRegistration extends EventRegistration{
	private int noOfParticipants;
	private int teamNo;
	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public void registerEvent() {
		int BaseFee=0;
		switch(getNameOfEvent()) {
		case "ShakeALeg":
			BaseFee=50;
			setRegistrationFee(BaseFee*getNoOfParticipants());
			System.out.println("Thank you "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+getTeamNo());	
			break;

		case "Sing&Win":
			BaseFee=60;
			setRegistrationFee(BaseFee*getNoOfParticipants());
			System.out.println("Thank you "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+getTeamNo());	
			break;

		case "Actathon":
			BaseFee=80;
			setRegistrationFee(BaseFee*getNoOfParticipants());
			System.out.println("Thank you "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+getTeamNo());	
			break;

		case "PlayAway":
			BaseFee=100;
			setRegistrationFee(BaseFee*getNoOfParticipants());
			System.out.println("Thank you "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
            System.out.println("You are participant no: "+getTeamNo());	
			break;

		default:
			System.out.println("Please choose a valid Event");
				
		}
	}
}
public class InhAndPolyEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleEventRegistration participant1=new SingleEventRegistration("Jenny", "Sing&Win",1);
		participant1.registerEvent();
		TeamEventRegistration team1=new TeamEventRegistration("Aura", "ShakeALeg",5,1);
		team1.registerEvent();
		SingleEventRegistration participant2=new SingleEventRegistration("Hudson", "PlayAway",2);
		participant2.registerEvent();
		
		

	}

}
