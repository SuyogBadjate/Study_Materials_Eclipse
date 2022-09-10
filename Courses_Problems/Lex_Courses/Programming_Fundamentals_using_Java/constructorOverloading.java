package Lex_Courses.Programming_Fundamentals_using_Java;

class Product2 {
	private int productId;
	private String name;
	private float price;
	Product2(int productId, String name, float price) {
		this(productId);
		this.name = name;
		this.price = price;
	}
	Product2(int productId) {
		this.productId = productId;
	}
	public void display() {
		System.out.println(productId);
		System.out.println(name);
		System.out.println(price);
	}
}

public class constructorOverloading {
		public static void main(String[] args) {		
			Product2 prodObj1 = new Product2(1001,"Twirty",8000.0f);
			prodObj1.display();
	        Product2 prodObj2 = new Product2(1002,"Jike",5400.0f);
			prodObj2.display();
		}
}
