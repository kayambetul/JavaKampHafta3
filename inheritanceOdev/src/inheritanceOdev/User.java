package inheritanceOdev;

public class User {

	String userEmail;
	int userId;
	
	public User() {
		
	}
	
	public User(String userEmail,int userId) {
		super();
		this.userEmail=userEmail;
		this.userId=userId;
		
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail=userEmail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId=userId;
	}
}
