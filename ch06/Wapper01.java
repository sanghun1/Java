package ch06;

public class Wapper01 {

	
	//���ڸ� ���ڷ� �ٲٴ� ��, ���ڸ� ���ڷ� �ٲٴ� ��
	public static void main(String[] args) {
		int num = 10;
		Integer num2 = 20;
		
		String num3 = num2.toString(); // ���ڸ� ���ڷ� �ٲٴ� �� 
		System.out.println(num3);
		
		String num4 = num + "";
		
		String num5 = "10";
		int num6 = Integer.parseInt(num5); // ���ڸ� ���ڷ� �ٲٴ� �� 
		System.out.println(num6);
	}

}
