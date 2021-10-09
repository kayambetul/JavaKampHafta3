package inheritanceOdev;

public class Student extends User{
	String studentName;
	String studentLastName;
	int studentNo;
	
	
	public Student() {
		
	}
	
	public Student(String studentName,String studentLastName,int studentNo) {
		super();
		this.studentName=studentName;
		this.studentLastName=studentLastName;
		this.studentNo=studentNo;
		
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName=studentLastName;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo=studentNo;
	}
}
