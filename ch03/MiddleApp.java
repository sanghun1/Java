package ch03;
import java.util.Scanner;

public class MiddleApp {

	public static void main(String[] args) {
		// ScannerŬ������ ���� 3���� �Է¹ް� 
		// 3���� ���� �� �߰� ũ���� ���� ����϶�
		// ��հ��� ���ϴ� ���� �ƴԿ� �����϶�
		
		// ex) ���� 3�� �Է� >> 20 100 33
		// �߰� ���� 33
		
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
			System.out.println("�߰� ���� " + num1);
		}
		else if(count2 == 0) {
			System.out.println("�߰� ���� " + num2);
		}
		else {
			System.out.println("�߰� ���� " + num3);
		}
	}

}
