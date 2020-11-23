package ch06;

public class User {
	private int id;
	private String username;
	private String password;
	
	
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}




	public static void main(String[] args) {
		User user = new User(1, "ssar", "1234");
		System.out.println(user);
		
		String s = "¾È³ç";
		System.out.println(s);
	}

}
