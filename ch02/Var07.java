package ch02;

// class 자료형 main이 만들어지기 전
class Car {
	static int power = 2000;
	static String color = "하얀색";
	static String name = "소나타";
	static String type = "승용차";
}
public class Var07 {

	public static void main(String[] args) {
		System.out.println(Car.power);
		System.out.println(Car.color);
		System.out.println(Car.name);
		System.out.println(Car.type);

	}

}
