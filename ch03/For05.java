package ch03;

public class For05 {

	public static void main(String[] args) {
		// 1부터 100까지 3의 배수의 합
		int result = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				result = i + result;
			}
		}
		System.out.println("1부터 100까지 3의 배수의 합 : " + result);
	}

}
