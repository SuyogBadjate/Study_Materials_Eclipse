package Lex_Courses.Programming_Fundamentals_using_Java;

class CourseRegistration{
	private String studentname;
	private int regId;
	private float qualifymarks;
	private double courseFee;
	private int courseId;
	private boolean hostelrequired;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public float getQualifymarks() {
		return qualifymarks;
	}
	public void setQualifymarks(float qualifymarks) {
		this.qualifymarks = qualifymarks;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean isHostelrequired() {
		return hostelrequired;
	}
	public void setHostelrequired(boolean hostelrequired) {
		this.hostelrequired = hostelrequired;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public boolean validateMarks() {
		return qualifymarks>=65 && qualifymarks<=100?true:false;
	}
	public boolean validateCourseId() {
		return courseId>=1001 && courseId<=1005?true:false;
	}
	public void calculateCourseFee() {
		if(validateMarks()) {
			   if(qualifymarks>=65 && qualifymarks<=69)
			   {   
				   int discount=5;
				   switch(courseId) {
				      case 1001: 
				    	  courseFee=55000*discount/100;
				    	  System.out.println(courseFee);
				      case 1002: 
				    	  courseFee=35675*discount/100;
				    	  System.out.println(courseFee);
				      case 1003: 
				    	  courseFee=28300*discount/100;
				    	  System.out.println(courseFee);
				      case 1004: 
				    	  courseFee=22350*discount/100;
				    	  System.out.println(courseFee);
				      case 1005: 
				    	  courseFee=115000*discount/100;
				    	  System.out.println(courseFee);	  
				   }
			       
			   }
			   else if(qualifymarks>=70 && qualifymarks<=84)
			   {   
				   int discount=10;
				   switch(courseId) {
				      case 1001: 
				    	  courseFee=55000*discount/100;
				    	  System.out.println(courseFee);
				      case 1002: 
				    	  courseFee=35675*discount/100;
				    	  System.out.println(courseFee);
				      case 1003: 
				    	  courseFee=28300*discount/100;
				    	  System.out.println(courseFee);
				      case 1004: 
				    	  courseFee=22350*discount/100;
				    	  System.out.println(courseFee);
				      case 1005: 
				    	  courseFee=115000*discount/100;
				    	  System.out.println(courseFee);	  
				   }
			       
			   }
			   else {
				   int discount=15;
				   switch(courseId) {
				      case 1001: 
				    	  courseFee=55000*discount/100;
				    	  System.out.println(courseFee);
				      case 1002: 
				    	  courseFee=35675*discount/100;
				    	  System.out.println(courseFee);
				      case 1003: 
				    	  courseFee=28300*discount/100;
				    	  System.out.println(courseFee);
				      case 1004: 
				    	  courseFee=22350*discount/100;
				    	  System.out.println(courseFee);
				      case 1005: 
				    	  courseFee=115000*discount/100;
				    	  System.out.println(courseFee);	  
				   }			       				   
			   }
		}
	
	}
	public void displayDetails() {
		System.out.println("*****************Course Allocation Details***************");
		System.out.println("Student Name :"+studentname);
		System.out.println("Course Id :"+courseId);
		System.out.println("Qualifying Exam Marks :"+qualifymarks);
		System.out.println("Student's registration Id :"+regId);
		System.out.print("Total Course fee :");calculateCourseFee();
		if(isHostelrequired())
			System.out.println("Hostel Required :Yes");
		else
			System.out.println("Hostel Required :No");

	}
	
	
}
public class Classes_ObjectsAss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseRegistration obj=new CourseRegistration();
		obj.setStudentname("Peter");
		obj.setRegId(5001);
		obj.setQualifymarks(78);
		obj.setCourseId(1005);
		obj.setHostelrequired(false);
		if (!obj.validateMarks()) {
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
		}
		else if(!obj.validateCourseId()) {
			System.out.println("Invalid Course Id. Please try again!!");
		}
		else if(obj.validateMarks() && obj.validateCourseId()) {
			obj.displayDetails();
	    }
		
		

	}

}
