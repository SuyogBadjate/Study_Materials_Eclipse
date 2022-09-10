package Lex_Courses.Programming_Fundamentals_using_Java;

class CarStore11 {
    public void searchCar(String manufacturer) {
    	System.out.println("Manufacturer: "+manufacturer);
    }
    public void searchCar(float topSpeed) {
        System.out.println("Topspeed: "+topSpeed);
    }
    public void searchCar(float topSpeed, String color) {
        System.out.println("Topspeed: "+topSpeed+" Color: "+color);
    }
}

public class staticPolyDemo {

	public static void main(String[] args) {
        CarStore11 showroom = new CarStore11();       
        showroom.searchCar("Nissan");                   
        showroom.searchCar(180.0f, "Blue");          
     }
}
