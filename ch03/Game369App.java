package ch03;
import java.util.Scanner;

public class Game369App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9 ) {
			
			if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				System.out.println("�ڼ�¦¦");
			}
			else {
				System.out.println("�ڼ�¦");
			}
		}
		else if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
			
			if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9 ) {
				System.out.println("�ڼ�¦¦");
			}
			else {
				System.out.println("�ڼ�¦");
			}
		}

	}

}
