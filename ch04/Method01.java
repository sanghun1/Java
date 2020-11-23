package ch04;


// 자바 특징 : 모든 코드는 class 내부에 둬야 한다.
public class Method01 {
	
	int num = 10; // heap
	static int num3 = 30; // static
	
	static void add() {
		System.out.println("add 함수 호출됨");
	}
	
	int sound = 10;
	
	void sound() {
		System.out.println("sound 함수 호출됨");
	}
	public static void main(String[] args) {
		int num2 = 20; //stack
		
		Method01.add();
		
		Method01 m = new Method01();
		m.sound();

	}

}
