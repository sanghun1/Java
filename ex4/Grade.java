package ex4;

import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;
	
	int average() {
		return ((math + science + english)/3);
	}
	public Grade() {
		// TODO Auto-generated constructor stub
	}
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scanner.close();

	}

}
