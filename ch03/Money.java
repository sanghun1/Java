package ch03;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // scan�� Ÿ���� ��ȯ�ؼ� �޾���
		int money = s.nextInt();
		
		if(money >= 50000) {
			int m5 = money / 50000;
			System.out.println("�������� " + m5 + "��");
			money = money % 50000;
		}
		if(money >= 10000) {
			int m1 = money / 10000;
			System.out.println("������ " + m1 + "��");
			money = money % 10000;
		}
		if(money >= 1000) {
			int ch1 = money / 1000;
			System.out.println("õ���� " + ch1 + "��");
			money = money % 1000;
		}
		if(money >= 100) {
			int b1 = money / 100;
			System.out.println("��� " + b1 + "��");
			money = money % 100;
		}
		if(money >= 50) {
			int s5 = money / 50;
			System.out.println("���ʿ� " + s5 + "��");
			money = money % 50;
		}
		if(money >= 10) {
			int s1 = money / 10;
			System.out.println("�ʿ� " + s1 + "��");
			money = money % 10;
		}
		if(money >= 1) {
			int i1 = money / 1;
			System.out.println("�Ͽ� " + i1 + "��");
		}
		
	}
		

}
