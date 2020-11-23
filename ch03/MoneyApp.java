package ch03;

import java.util.Scanner;

public class MoneyApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요.");
		
		final int money = s.nextInt();
		int rMoney = money;
		int rCount = 0;
		
//		rCount = rMoney / 50000;
//		rMoney = rMoney % 50000;
//		System.out.println("5만원권 : " + rCount);
//		
//		rCount = rMoney / 10000;
//		rMoney = rMoney % 10000;
//		System.out.println("1만원권 : " + rCount);
//		
//		rCount = rMoney / 1000;
//		rMoney = rMoney % 1000;
//		System.out.println("1천원권 : " + rCount);
//		
//		rCount = rMoney / 100;
//		rMoney = rMoney % 100;
//		System.out.println("1백원권 : " + rCount);
//		
//		rCount = rMoney / 50;
//		rMoney = rMoney % 50;
//		System.out.println("5십원권 : " + rCount);
//		
//		rCount = rMoney / 10;
//		rMoney = rMoney % 10;
//		System.out.println("1십원권 : " + rCount);
//		
//		rCount = rMoney / 1;
//		rMoney = rMoney % 1;
//		System.out.println("1원권 : " + rCount);
		
		int[] arr = {50000, 10000, 1000, 100, 50, 10, 1};
		
		for (int i = 0; i <= 6; i++) {
			rCount = rMoney / arr[i];
			rMoney = rMoney % arr[i];
			if(rCount != 0) {
			System.out.println(arr[i] + "원권 : " + rCount);
			}
		}

	}

}
