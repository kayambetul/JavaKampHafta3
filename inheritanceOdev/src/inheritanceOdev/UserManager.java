package inheritanceOdev;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.userId + " giri� yapt�");
	}
	public void multiAdd(User[] users) {
		for (User user : users) {
			add(user);
			
		}
		
	}
}
