package Login;

// OAuth -> Open Auth
public class Naver implements OAuth{
	private String provider;
	private String email;
	private String password;
	private String username;
	
	public Naver() {
		this("naver", "ssar@nate.com", "1234", "±úºÀ");
	}

	public Naver(String provider, String email, String password, String username) {
		this.provider = provider;
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String oauthProvider() {
		return provider;
	}

	@Override
	public String oauthId() {
		return email;
	}

	@Override
	public String oauthPassword() {
		return password;
	}

	@Override
	public String oauthNick() {
	// TODO Auto-generated method stub
		return username;
}
}

