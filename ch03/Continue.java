package ch03;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = s.nextInt();
			
			if(n <= 0) { // �����̰ų� 0�̸�
				//continue; // ��� ���� �ݺ������� �Ѿ�� ��ɾ�
				break; // �ݺ����� �����ϴ� ��ɾ�
			}
			else {
				sum = sum + n;
			}
		}
		System.out.println("����� �� : " + sum);
		s.close();
	}
}
