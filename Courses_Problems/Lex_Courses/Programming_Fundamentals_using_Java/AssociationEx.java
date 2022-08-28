package Lex_Courses.Programming_Fundamentals_using_Java;

class CabService{
	private String name;
	private int totalNumberOfCars;
	private int numberOfCarsBooked;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalNumberOfCars() {
		return totalNumberOfCars;
	}
	public void setTotalNumberOfCars(int totalNumberOfCars) {
		this.totalNumberOfCars = totalNumberOfCars;
	}
	public int getNumberOfCarsBooked() {
		return numberOfCarsBooked;
	}
	public void setNumberOfCarsBooked(int numberOfCarsBooked) {
		this.numberOfCarsBooked = numberOfCarsBooked;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price+= price;
	}
	public CabService(String name, int totalNumberOfCars, int numberOfCarsBooked, int price) {
		super();
		this.name = name;
		this.totalNumberOfCars = totalNumberOfCars;
		this.numberOfCarsBooked = numberOfCarsBooked;
		this.price = price;
	}
	
	public int calculateExtraPrice(Driver1 driver) {
		if(driver.getRating()>=4.5 && driver.getRating()<=5)
		{
			price+=price*5/100;
			return price;
		}
		else {
			return price;
		}
	}

}
class Driver1{
	private String name;
	private float rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Driver1(String name, float rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	
}
public class AssociationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CabService obj=new CabService("Wala", 4, 2, 200);
		Driver1 obj1=new Driver1("Vasanth", 4.6f);
		obj.calculateExtraPrice(obj1);
		obj.setPrice(100);
		if(obj.getNumberOfCarsBooked()<=obj.getTotalNumberOfCars())
		   System.out.println(obj.calculateExtraPrice(obj1));
		else
		   System.out.println("No more Cars");
	}

}
