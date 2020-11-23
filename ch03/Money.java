package ch03;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // scan은 타입을 변환해서 받아줌
		int money = s.nextInt();
		
		if(money >= 50000) {
			int m5 = money / 50000;
			System.out.println("오만원권 " + m5 + "매");
			money = money % 50000;
		}
		if(money >= 10000) {
			int m1 = money / 10000;
			System.out.println("만원권 " + m1 + "매");
			money = money % 10000;
		}
		if(money >= 1000) {
			int ch1 = money / 1000;
			System.out.println("천원권 " + ch1 + "매");
			money = money % 1000;
		}
		if(money >= 100) {
			int b1 = money / 100;
			System.out.println("백원 " + b1 + "매");
			money = money % 100;
		}
		if(money >= 50) {
			int s5 = money / 50;
			System.out.println("오십원 " + s5 + "매");
			money = money % 50;
		}
		if(money >= 10) {
			int s1 = money / 10;
			System.out.println("십원 " + s1 + "매");
			money = money % 10;
		}
		if(money >= 1) {
			int i1 = money / 1;
			System.out.println("일원 " + i1 + "매");
		}
		
	}
		

}
