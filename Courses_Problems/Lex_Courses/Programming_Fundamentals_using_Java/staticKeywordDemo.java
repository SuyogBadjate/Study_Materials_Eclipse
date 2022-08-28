package Lex_Courses.Programming_Fundamentals_using_Java;

class Product1 {
	private static int idCounter;
	private String name;
	private float price;
	private int stock;
	public int productId;

	// getters and setters
	public Product1() {
		this.productId = ++idCounter;
	}

	static {
		idCounter = 100;
	}

	public static void getCounter() {
		System.out.println("Current value:" + idCounter);
	}
}

public class staticKeywordDemo {
	public static void main(String[] args) {
		Product1 p = new Product1();
		Product1 p1 = new Product1();
		Product1.getCounter();
	}
}
