package demo;

public class NumberMultipleEx {
	
	static String Multiple(int num) {
		if(num%3==0 && num%5==0)
			return "Zoom";
		else if(num%3==0) 
			return "Zip";
		else if(num%5==0)
			return "Zap";
		else
			return "Invalid";
						
	}
	public static void main(String[] args) {
		System.out.println(Multiple(22));
	}

}
