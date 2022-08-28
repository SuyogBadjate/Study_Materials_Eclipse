package Lex_Courses.Programming_Fundamentals_using_Java;

class Chocolate{
	private int barCode;
	private String name;
	private int weight;
	private int cost;
	Chocolate(){
		
	}
	public int getBarCode() {
		return barCode;
	}
	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
public class constructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate obj=new Chocolate();
		obj.setBarCode(1234567890);
		obj.setCost(200);
		obj.setName("Random");
		obj.setWeight(90);
		System.out.println("Barcode: "+obj.getBarCode()+"\tCost: "+obj.getCost()+"\tName: "+obj.getName()+"\tWeight: "+obj.getWeight());

	}

}
