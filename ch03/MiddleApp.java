package ch03;
import java.util.Scanner;

public class MiddleApp {

	public static void main(String[] args) {
		// Scanner클래스로 정수 3개를 입력받고 
		// 3개의 숫자 중 중간 크기의 수를 출력하라
		// 평균값을 구하는 것이 아님에 주의하라
		
		// ex) 정수 3개 입력 >> 20 100 33
		// 중간 값은 33
		
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int count1 = 0, count2 = 0, count3 = 0;
		
		if(num1 < num2) {
			count1--;
			count2++;
		}
		else {
			count1++;
			count2--;
		}
		
		if(num1 < num3) {
			count1--;
			count3++;
		}
		else {
			count1++;
			count3--;
		}
		
		if(num2 < num3) {
			count2--;
			count3++;
		}
		else {
			count2++;
			count3--;
		}
		
		if(count1 == 0) {
			System.out.println("중간 값은 " + num1);
		}
		else if(count2 == 0) {
			System.out.println("중간 값은 " + num2);
		}
		else {
			System.out.println("중간 값은 " + num3);
		}
	}

}
