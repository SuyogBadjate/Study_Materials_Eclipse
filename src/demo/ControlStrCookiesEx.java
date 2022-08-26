package demo;

public class ControlStrCookiesEx {
	
	static int NoOfCookies(int F_tookoff,int F_landed,int SCapa_F_tookOff,int SCapa_F_landed) {
	    return SCapa_F_tookOff*2*F_tookoff + SCapa_F_landed/2*2*F_landed;
	}
	public static void main(String[] args) {
		System.out.println(NoOfCookies(50,85,180,150));
	}

}
