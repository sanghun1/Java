package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int check = 0; 
		// ���� - �� ����
		while(check >= 0) {
			int num = s.nextInt();
			System.out.println("���� �� : " + num);
			check = num;
//			if(num < 0) {
//				break;
//			}
		}

	}

}
