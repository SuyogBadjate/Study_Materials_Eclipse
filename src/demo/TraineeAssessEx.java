package demo;

public class TraineeAssessEx {

	static String TraioneeAssessment(int marks) {
		return marks>=65 ? "The trainee has passed" : "The trainee has failed";
	
	}
	public static void main(String[] args) {
		System.out.println(TraioneeAssessment(50));
	}
}
