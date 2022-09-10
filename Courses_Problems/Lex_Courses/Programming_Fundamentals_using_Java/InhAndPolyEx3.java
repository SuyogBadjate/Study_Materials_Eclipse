package Lex_Courses.Programming_Fundamentals_using_Java;

class Ticket{
	private int startPoint;
	private int endPoint;
	private int ticketAmount;
	Ticket(){
		
	}
	Ticket(int startPoint,int endPoint){
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	public int getStartPoint() {
		return startPoint;
	}
	public int getEndPoint() {
		return endPoint;
	}
	public int getTicketAmount() {
		return ticketAmount;
	}
	public boolean validateTravelPoints() {
		return endPoint>0&&startPoint>0&&endPoint>startPoint?true:false;
	}
	public int calcTicketAmt() {
		ticketAmount=(endPoint-startPoint)*10;
		return ticketAmount;
	}
}
public class InhAndPolyEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket obj=new Ticket(10, 1);
		if(obj.validateTravelPoints())
		  System.out.println("The ticket amount to be colldected from the passenger for the journey is Rs: "+obj.calcTicketAmt());
		else
			System.out.println("Invalid journey details");
	}

}
