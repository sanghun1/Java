package ch03;

import java.util.Scanner;

public class MoneyApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��ϼ���.");
		
		final int money = s.nextInt();
		int rMoney = money;
		int rCount = 0;
		
//		rCount = rMoney / 50000;
//		rMoney = rMoney % 50000;
//		System.out.println("5������ : " + rCount);
//		
//		rCount = rMoney / 10000;
//		rMoney = rMoney % 10000;
//		System.out.println("1������ : " + rCount);
//		
//		rCount = rMoney / 1000;
//		rMoney = rMoney % 1000;
//		System.out.println("1õ���� : " + rCount);
//		
//		rCount = rMoney / 100;
//		rMoney = rMoney % 100;
//		System.out.println("1����� : " + rCount);
//		
//		rCount = rMoney / 50;
//		rMoney = rMoney % 50;
//		System.out.println("5�ʿ��� : " + rCount);
//		
//		rCount = rMoney / 10;
//		rMoney = rMoney % 10;
//		System.out.println("1�ʿ��� : " + rCount);
//		
//		rCount = rMoney / 1;
//		rMoney = rMoney % 1;
//		System.out.println("1���� : " + rCount);
		
		int[] arr = {50000, 10000, 1000, 100, 50, 10, 1};
		
		for (int i = 0; i <= 6; i++) {
			rCount = rMoney / arr[i];
			rMoney = rMoney % arr[i];
			if(rCount != 0) {
			System.out.println(arr[i] + "���� : " + rCount);
			}
		}

	}

}
