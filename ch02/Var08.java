package ch02;

//heap main�� ������ �� ���� �������
class Zealot{
	String name = "����";
	int attack = 10;
	int armor = 5;
	
	static int hp = 100;
}
public class Var08 {

	public static void main(String[] args) {
		//
		Zealot z = new Zealot();
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);

		Zealot z2 = new Zealot();
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack = 50;
		System.out.println("��ȭ ����");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		z.hp = 50; // Zealot.hp
		
		System.out.println(Zealot.hp);
		System.out.println(Zealot.hp);
		
		z.attack = 11;
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}

}
