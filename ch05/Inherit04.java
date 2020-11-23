package ch05;
// 인터페이스 정의
// 약속을 만드는 갑ㅅ
// 인터페이스는 new 할 수 없다. 왜냐면 추상메서드를 가졌기 때문
// 인터페이스는 강제성을 보유 타입을 일치시키게 하고 
// 오버라이드를 하게 해준다
interface Animal2{
	void sound(); // 추상매서드 (함수의 몸체가 없다)
}

class Dog2 implements Animal2{

	public void sound() {
		System.out.println("멍멍");
		
	}

}

class Cat2 implements Animal2{
	public void sound() {
		System.out.println("야옹");
		
	}
}

class Bird2 implements Animal2{
	public void sound() {
		System.out.println("짹짹");
		
	}
}

class Monkey implements Animal2{
	public void sound() {
		System.out.println("몽몽");
		
	}
}
//Monkey 클래스 만들고 (몽몽) 출력하고 반드시 Animal2를 구현하시오

public class Inherit04 {

	static void start(Animal2 a) {
		a.sound();
	}
	public static void main(String[] args) {
		// 자기 자신의 클래스의 static을 호출할 때는 클래스명 생략 가능
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Monkey());

	}

}
