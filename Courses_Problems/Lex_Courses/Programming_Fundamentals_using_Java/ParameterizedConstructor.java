package Lex_Courses.Programming_Fundamentals_using_Java;

class ParameterizedConstructor1 {
		private int productId;
		private String name;
		private float price;
		ParameterizedConstructor1(int pId, String pName, float productPrice){
	        System.out.println("Parameterized Constructor");
			productId = pId;
			name = pName;
			price = productPrice;
		}
		public void display() {
			System.out.println(productId);
			System.out.println(name);
			System.out.println(price);
		}
}
public class ParameterizedConstructor{
		public static void main(String[] args) {
			ParameterizedConstructor1 prodObj1 = new ParameterizedConstructor1(1001,"Twirty",8000.0f);
			prodObj1.display();
			ParameterizedConstructor1 prodObj2 = new ParameterizedConstructor1(1002,"Tooty",8500.0f);
			prodObj2.display();	
		}
}


