package Lex_Courses.Programming_Fundamentals_using_Java;

class NKShop{
	public int itemId;
	public double price;
	public int size;
	public String brandName;
	public String itemtype;
	
	public void calculatePrice(int itemId) {
		if (itemId==1001)
		{	price=1200;
		}else if (itemId==1002)
		{	price=1000;
		}else if (itemId==1003)
		{	price=999;
		}else if (itemId==1004)
		{	price=1500;
		}else {
			price=0;
		}
		System.out.print("The price of the item is "+price);
	}
	public void calculatePrice(String brandName,String itemType,int size) {
		switch(brandName) {
		    case "Puma":
		    	switch(itemType) {
		    	case "T-shirt":
		    		switch(size) {
		    		case 32: price=1200;
   		                     itemId=1001;
		    		case 34: price=1200;
   		                     itemId=1001;
		    		}
		    	case "Skirt":
		    		switch(size) {
		    		case 32: price=1000;
		    		         itemId=1002;
		    		case 34: price=1000;
   		                     itemId=1002;
		    		}
		    	}
		    	break;
		    case "Reebok":
		    	switch(itemType) {
		    	case "T-shirt":
		    		switch(size) {
		    		case 32: price=999;
   		                     itemId=1003;
		    		case 34: price=999;
   		                     itemId=1003;
		    		}
		    	case "Skirt":
		    		switch(size) {
		    		case 32: price=1500;
		    		         itemId=1004;
		    		case 34: price=1500;
   		                     itemId=1004;
		    		}
		    	}
		    	break;
		    	
		    default:
		    	price=0;
		    	
		    	
		    	
		}
		System.out.println("The price for the item is "+price);
	}
}
public class InhAndPolyEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NKShop obj=new NKShop();
		obj.calculatePrice("Reebok", "Skirt", 34);
		obj.calculatePrice(1003);

	}

}
