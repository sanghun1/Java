package ch04;

// �ż���ȿ� �ż��带 ������ �� ����.
// ctrl + shift + f : ����
// ������ �ż��带 ���� �� ����.
public class Method04 {

	int money = 10000; // heap
	
	int add(int num) { // int num stack, add() heap
		int money2 = money + num;
		return money2;
	}

	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		System.out.println();
		System.out.println(m.money);
	}

}
