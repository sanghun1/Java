package ch05;
// �������̽� ����
// ����� ����� ����
// �������̽��� new �� �� ����. �ֳĸ� �߻�޼��带 ������ ����
// �������̽��� �������� ���� Ÿ���� ��ġ��Ű�� �ϰ� 
// �������̵带 �ϰ� ���ش�
interface Animal2{
	void sound(); // �߻�ż��� (�Լ��� ��ü�� ����)
}

class Dog2 implements Animal2{

	public void sound() {
		System.out.println("�۸�");
		
	}

}

class Cat2 implements Animal2{
	public void sound() {
		System.out.println("�߿�");
		
	}
}

class Bird2 implements Animal2{
	public void sound() {
		System.out.println("±±");
		
	}
}

class Monkey implements Animal2{
	public void sound() {
		System.out.println("����");
		
	}
}
//Monkey Ŭ���� ����� (����) ����ϰ� �ݵ�� Animal2�� �����Ͻÿ�

public class Inherit04 {

	static void start(Animal2 a) {
		a.sound();
	}
	public static void main(String[] args) {
		// �ڱ� �ڽ��� Ŭ������ static�� ȣ���� ���� Ŭ������ ���� ����
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Monkey());

	}

}
