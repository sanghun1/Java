package ch03;
import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
		// ���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.
		// ö�� >> ����
		// ���� >> ��
		// ö���� �̰���ϴ�.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("ö�� >> ");
		String a1 = s.nextLine();
		
		System.out.print("���� >> ");
		String a2 = s.nextLine();
		
		if(a1.equals(a2)) {
			System.out.println("�����ϴ�.");
		}
		else if(a1.equals("����") && a2.equals("����")) {
			System.out.println("���� �̰���ϴ�.");
		}
		else if(a1.equals("����") && a2.equals("��")) {
			System.out.println("ö���� �̰���ϴ�.");
		}
		else if(a1.equals("����") && a2.equals("����")) {
			System.out.println("ö���� �̰���ϴ�.");
		}
		else if(a1.equals("����") && a2.equals("��")) {
			System.out.println("���� �̰���ϴ�.");
		}
		else if(a1.equals("��") && a2.equals("����")) {
			System.out.println("���� �̰���ϴ�.");
		}
		else if(a1.equals("��") && a2.equals("����")) {
			System.out.println("ö���� �̰���ϴ�.");
		}
		else {
			System.out.println("�ٸ� ���� �Է��Ͽ����ϴ�.");
		}
	}

}
