package ch03;

public class For05 {

	public static void main(String[] args) {
		// 1���� 100���� 3�� ����� ��
		int result = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				result = i + result;
			}
		}
		System.out.println("1���� 100���� 3�� ����� �� : " + result);
	}

}
