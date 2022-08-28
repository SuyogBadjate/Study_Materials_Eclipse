package Lex_Courses.Programming_Fundamentals_using_Java;

class Product {
	private int productId;
	private String name;
	private float price;
	Product(){};
	Product(int productId, String name, float price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	public void display() {
		System.out.println(productId);
		System.out.println(name);
		System.out.println(price);
	}	
}

public class ThisKeywordDemo {
	 public static void main(String[] args) {
			Product prodObj = new Product();
			prodObj.display();
			Product prodObj1 = new Product(1001, "Twirty", 8000.0f);
			prodObj1.display();
		}
}
