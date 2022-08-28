package Lex_Courses.Programming_Fundamentals_using_Java;

class RRAccount{
	private String custName;
	private Address1 address;
	private double depositAmount;
	public String getCustName() {
		return custName;
	}
	public Address1 getAddress() {
		return address;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public boolean isValidAddress() {		
	    if(String.valueOf(address.getPinCode()).length()==6) 
	    	return true;
	    else
	    	return false;
	}
	public RRAccount(String custName, Address1 address, double depositAmount) {
		super();
		this.custName = custName;
		this.address = address;
		this.depositAmount = depositAmount;
	}
	@Override
	public String toString() {
		return address.getFirstLine()+", "+address.getSecondLine()+", "+address.getCity()+", "+address.getState()+", "+address.getPinCode();
	}
	
	
	
}
class Address1{
	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private int pinCode;
	public String getFirstLine() {
		return firstLine;
	}
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	public String getSecondLine() {
		return secondLine;
	}
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public Address1(String firstLine, String secondLine, String city, String state, int pinCode) {
		super();
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
}
public class OopsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Address1 address1=new Address1("No.123", "9th Cross, Trinethra Circle", "Mysuru", "Karnataka", 570017);
        RRAccount rrAccount=new RRAccount("Rakesh", address1, 50000.0);
        if(rrAccount.isValidAddress()) {
        	System.out.println("Customeer Details");
        	System.out.println("***********************************");
        	System.out.println("Customer Name : "+rrAccount.getCustName());
        	System.out.println("Address : "+rrAccount.toString());
        	System.out.println("Deposit Amount : "+rrAccount.getDepositAmount());
        	System.out.println("Congratulations!! Your Account has been created");        
        	}
        else {
        	System.out.println("The pin code:"+address1.getPinCode()+" entered by you is invalid!!");
        }
	}

}
