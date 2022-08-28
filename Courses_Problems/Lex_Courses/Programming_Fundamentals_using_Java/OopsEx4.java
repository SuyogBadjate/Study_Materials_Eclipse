package Lex_Courses.Programming_Fundamentals_using_Java;

class Loan{
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	private static int loanCounter;
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	static {
		loanCounter=101;
	}
	
	public static int getLoanCounter() {
		return loanCounter;
	}
	public static void setLoanCounter(int loanCounter) {
		Loan.loanCounter = loanCounter;
	}
	private Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
		loanCounter++;
	}
	private Loan() {
		loanCounter++;
	}
	public static Loan getLoanInstance() {
		Loan obj=new Loan();
		return obj;
	}
	public static Loan getLoanInstance(int i, int j, float f, int k, int l) {
		// TODO Auto-generated method stub
		Loan obj=new Loan(i, j, f, k, l);
		return obj;
	}
}
public class OopsEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan obj1=Loan.getLoanInstance();
		Loan obj2=Loan.getLoanInstance(1001, 201, 450000.50f, 4, 4500);
		Loan obj3=Loan.getLoanInstance(1002, 202, 450000.50f, 4, 4500);
		Loan obj4=Loan.getLoanInstance(1003, 203, 450000.50f, 4, 4500);
		Loan obj5=Loan.getLoanInstance();
		
		System.out.println(Loan.getLoanCounter());
		

	}

}
