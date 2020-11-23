package ch04;

class User{
	private int id;
	private String name;
	private String phone;
	
	
	public User(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	 
	
}
public class Array01 {

	public static void main(String[] args) {
		User[] users = new User[3];
		
		users[0] = new User(1, "홍길동", "01022222222");
		users[1] = new User(1, "임꺽정", "01033333333");
		users[2] = new User(1, "장보고", "01044444444");
		
		System.out.println(users[0].getName());
		
		
		// 장보고의 모든 정보를 출력
		System.out.println(users[2].getId());
		System.out.println(users[2].getName());
		System.out.println(users[2].getPhone());

	}

}
