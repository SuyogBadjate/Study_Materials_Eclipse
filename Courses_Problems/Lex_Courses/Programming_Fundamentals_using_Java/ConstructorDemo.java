package Lex_Courses.Programming_Fundamentals_using_Java;

class ConstructorDemo1 {
		private int productId;
		private String name;
		private float price;
		
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		ConstructorDemo1(){
			System.out.println("Default constructor");
	        productId = 0;
			name = null;
			price = 0.0f;
		}	
		public void display() {
			System.out.println(productId);
			System.out.println(name);
			System.out.println(price);
		}
}	
public class ConstructorDemo{
		public static void main(String[] args) {
			ConstructorDemo1 prodObj1 = new ConstructorDemo1();
			prodObj1.display();//displays default values
			ConstructorDemo1 prodObj2 = new ConstructorDemo1();
			prodObj2.setProductId(1001);
			prodObj2.setName("Splash");
			prodObj2.setPrice(120.0f); 
			prodObj2.display();//displays the values set
	   }

}
	

