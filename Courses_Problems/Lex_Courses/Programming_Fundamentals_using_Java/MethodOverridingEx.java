package Lex_Courses.Programming_Fundamentals_using_Java;

class Pizza{
	private String name;
	private String size;
	Pizza(String name,String size){
		this.name=name;
		this.size=size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int buyPizza(String size) {
		if(size=="small")
			return 50;
		else if(size=="medium")
			return 100;
		else if(size=="small")
			return 150;
		else
			return 0;
		
	}
}
class PannerPizza extends Pizza{
	private int price;
	PannerPizza(String name,String size){
		super(name,size);	
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int buyPizza(String size) {
		if(size=="small")
			return 100;
		else if(size=="medium")
			return 200;
		else if(size=="small")
			return 300;
		else
			return 0;
	}
}
class NonVegPizza extends Pizza{
	private int price;
	NonVegPizza(String name,String size){
		super(name,size);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int buyPizza(String size) {
		if(size=="small")
			return 150;
		else if(size=="medium")
			return 250;
		else if(size=="small")
			return 350;
		else
			return 0;
	}
}
public class MethodOverridingEx {
	public static void main(String[] args) {
		Pizza obj=new NonVegPizza("PaneerMakhani", "medium");
		System.out.println("Pizza:"+obj.getName()+" Type:"+obj.getSize());
		System.out.println("Price: "+obj.buyPizza("medium"));
		
		
	}

}
