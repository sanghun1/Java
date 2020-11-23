package ch03;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = s.nextInt();
			
			if(n <= 0) { // 음수이거나 0이면
				//continue; // 즉시 다음 반복문으로 넘어가는 명령어
				break; // 반복문을 종료하는 명령어
			}
			else {
				sum = sum + n;
			}
		}
		System.out.println("양수의 합 : " + sum);
		s.close();
	}
}
