package demo;

public class TypeConversionEx2 {
	public static void main(String[] args) {
		int Bill_id=1001,customer_id=101,discount=2;
        double bill_amount=199.99,discounted_bill_amount=0.0;
        discounted_bill_amount = bill_amount - bill_amount * ((double)discount/100);
        System.out.println(discounted_bill_amount);	     
	}

}
