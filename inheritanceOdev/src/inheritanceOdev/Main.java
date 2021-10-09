package inheritanceOdev;

public class Main {
	public static void main(String[] args) {
		
		Instructor instructor=new Instructor();
		instructor.setInstructorName("Engin");
		instructor.setInstructorBrans("Java");
		instructor.setUserId(1);
		instructor.setUserEmail("engin@");
		
		Student student=new Student();
		student.setStudentName("Betül");
		student.setStudentLastName("Kayam");
		student.setStudentNo(123);
		student.setUserId(2);
		student.setUserEmail("betul@");
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.Add(instructor);
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.Add(student);
		
		UserManager userManager=new UserManager();
		User[] users= {instructor,student};
		userManager.multiAdd(users);
		
		LoggerManager loggerManager=new LoggerManager();
		loggerManager.Add(new DatabaseLogger());
			
		
		
	}

}
