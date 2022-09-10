package Lex_Courses.Programming_Fundamentals_using_Java;

class Account{
	private int acNo;
	private Customer customer;
	private double balance;
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		setBalance(balance+amount);
	}
}
class SavingsAccount extends Account{
	private double minimumBalance;
	private int interestRate;
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public SavingsAccount(int acNo,double minimumBalance, int interestRate) {
		super();
		this.minimumBalance = minimumBalance;
		this.interestRate = interestRate;
	}
	public void withdraw(double amount) {
		if(super.getBalance()>minimumBalance)
			System.out.println("You don't have sufficent balance!");
		else
			super.setBalance(super.getBalance()-amount);
	}
	public double calculateInterest() {
		return super.getBalance()+super.getBalance()*interestRate;
	}
	
	
}
class CurrentAccount extends Account{
	private int overdraftAmount;

	public int getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(int overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public CurrentAccount(Customer customer,int overdraftAmount,int acNo,double balance) {
		super();
		this.overdraftAmount = overdraftAmount;
	}
	public void withdraw(double amount) {
		if(amount>getOverdraftAmount()+super.getBalance())
			System.out.println("You cannot withdraw this amount. Not enough balance");
		else
			if(amount-overdraftAmount<=0)
				super.setBalance(super.getBalance()-amount);
			else
				setOverdraftAmount((int)amount-overdraftAmount);
		
	}
}
class Customer{
	private String name;
	private int custId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
}
public class InhAndPolyEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj=new Customer();
		obj.setCustId(1001);
		obj.setName("John");
		SavingsAccount accountSA=new SavingsAccount(101, 500, 12);
		accountSA.withdraw(1600);
		Customer obj2=new Customer();
		obj2.setCustId(1002);
		obj2.setName("Jenny");
		CurrentAccount accountCA=new CurrentAccount(obj2, 500, 102, 2000);
		accountCA.deposit(1500);
		accountCA.withdraw(4000);
		accountCA.getBalance();
		accountCA.withdraw(1500);

		System.out.println("Name: "+obj.getName()+", Balance: "+accountSA.getBalance()+", Interest: "+accountSA.getInterestRate());
		System.out.println("Balance: "+accountCA.getBalance()+"Name: "+obj2.getName());

	}

}
