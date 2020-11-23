package ch04;


class President{
	private static President instance = new President();
	
	private President() {
		
	}

	public static President getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
}

public class SingtoneApp {

	public static void main(String[] args) {
		President p = President.getInstance();

	}

}
