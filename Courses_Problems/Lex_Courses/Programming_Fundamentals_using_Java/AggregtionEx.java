package Lex_Courses.Programming_Fundamentals_using_Java;

class Bill{
	private int billId;
	private int billAmount;
	private String[] medicines;
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String[] getMedicines() {
		return medicines;
	}
	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}
	public Bill(int billId, int billAmount, String[] medicines) {
		super();
		this.billId = billId;
		this.billAmount = billAmount;
		this.medicines = medicines;
	}
	
}

class Patient{
	private String patientName;
	private int age;
	private Bill bill;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public Patient(String patientName, int age, Bill bill) {
		super();
		this.patientName = patientName;
		this.age = age;
		this.bill = bill;
	}
	public int CalculateDiscount() {
		if(bill.getMedicines().length>5)
			return 5;
		else
			return 0;
	}
}
public class AggregtionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] medicines={"Alo","vel","kzry","sento","myx","logy"};
		Bill bill1=new Bill(101, 1000, medicines);
		Patient p1=new Patient("Vignesh", 23, bill1);
		int totalAmount = bill1.getBillAmount() - bill1.getBillAmount()*p1.CalculateDiscount()/100;
		System.out.println("Hi "+p1.getPatientName()+" you need to pay "+totalAmount);
		

	}

}
