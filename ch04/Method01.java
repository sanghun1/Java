package ch04;


// �ڹ� Ư¡ : ��� �ڵ�� class ���ο� �־� �Ѵ�.
public class Method01 {
	
	int num = 10; // heap
	static int num3 = 30; // static
	
	static void add() {
		System.out.println("add �Լ� ȣ���");
	}
	
	int sound = 10;
	
	void sound() {
		System.out.println("sound �Լ� ȣ���");
	}
	public static void main(String[] args) {
		int num2 = 20; //stack
		
		Method01.add();
		
		Method01 m = new Method01();
		m.sound();

	}

}
