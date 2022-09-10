package Lex_Courses.Programming_Fundamentals_using_Java;

class Pizza1{
	private String name;
	private int price;
	private String size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Pizza1(String name, int price, String size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}
	
}
public class InhAndPolyEx2 {

	    Pizza1 obj1=new Pizza1("Paneer", 360, "medium");
	    Pizza1 obj2=new Pizza1("PaneerM", 450, "small");
	    Pizza1 obj3=new Pizza1("PaneerO", 400, "large");

		Pizza1[] pizzaData= {obj1,obj2,obj3};
		public void buyPizza(String name) {
			boolean res=false;
			for(Pizza1 obj:pizzaData) {
				   res = obj.getName()==name?true:false;
				   if(res)
					   break;
				   else
					   continue;
				}
			if(res==true)
				System.out.println("Hi your pizza is successfully booked");
			else
				System.out.println("Hi sorry,your pizza is not available");
		
		}
		public void buyPizza(int price,String size) {
			boolean res=false;
			for(Pizza1 obj:pizzaData) {
				   res = obj.getPrice()==price&&obj.getSize()==size?true:false;
				   if(res)
					   break;
				   else
					   continue;
				}
			if(res==true)
				System.out.println("Hi your pizza is successfully booked");
			else
				System.out.println("Hi sorry,your pizza is not available");
		}

	    public static void main(String[] args) {
		    InhAndPolyEx2 obj=new InhAndPolyEx2();
		    obj.buyPizza("Paneer");
		    obj.buyPizza(450, "medium");
	    }

}
