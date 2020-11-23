package Login;

public class LoginApp {
	
	static void userInfo(OAuth o) {
		System.out.println(o.oauthProvider() + "(으)로 로그인한 사용자는....");
		System.out.println(o.oauthId());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
	}
	public static void main(String[] args) {
		Facebook f = new Facebook();
		userInfo(f);
		
		Naver n = new Naver();
		userInfo(n);
		
		Kakao k = new Kakao();
		userInfo(k);

	}

}
