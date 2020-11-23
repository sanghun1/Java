package ch03;
import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
		// 가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.
		// 철수 >> 가위
		// 영희 >> 보
		// 철수가 이겼습니다.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("철수 >> ");
		String a1 = s.nextLine();
		
		System.out.print("영희 >> ");
		String a2 = s.nextLine();
		
		if(a1.equals(a2)) {
			System.out.println("비겼습니다.");
		}
		else if(a1.equals("가위") && a2.equals("바위")) {
			System.out.println("영희가 이겼습니다.");
		}
		else if(a1.equals("가위") && a2.equals("보")) {
			System.out.println("철수가 이겼습니다.");
		}
		else if(a1.equals("바위") && a2.equals("가위")) {
			System.out.println("철수가 이겼습니다.");
		}
		else if(a1.equals("바위") && a2.equals("보")) {
			System.out.println("영희가 이겼습니다.");
		}
		else if(a1.equals("보") && a2.equals("가위")) {
			System.out.println("영희가 이겼습니다.");
		}
		else if(a1.equals("보") && a2.equals("바위")) {
			System.out.println("철수가 이겼습니다.");
		}
		else {
			System.out.println("다른 것을 입력하였습니다.");
		}
	}

}
