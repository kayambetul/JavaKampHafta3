package inheritanceOdev;

public class Instructor extends User{
	
	String instructorName;
	String instructorBrans;
	
	public  Instructor() {
		
	}
	
	public Instructor(String instructorName,String instructorBrans) {
		super();
		this.instructorName=instructorName;
		this.instructorBrans=instructorBrans;
	}
	
	public String getInstructorName() {
		return instructorName;
	}
	
	public void setInstructorName(String instructorName) {
		this.instructorName=instructorName;
	}
	
	public String getInstructorBrans() {
		return instructorBrans;
	}
	public void setInstructorBrans(String instructorBrans) {
		this.instructorBrans=instructorBrans;
	}
	
	
	
	
	
	

}
