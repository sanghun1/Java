package star2;


//1. Zealot, Dragoon, Tank, Scv, DarkTempler = > StarUnit Ÿ�� ��ġ

public class Star3App {

	// u1 -> u2 �� ����
	static void attack(StarUnit u1, StarUnit u2) {
		// 1. hp�� ������ �� �ִ� �Լ� setHp(int hp)
		// 2. hp�� ���� Ȯ���ϴ� �Լ� getHp()
		// 3. attack�� ���� Ȯ���ϴ� �Լ� getAttack()
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName()+" ü�� : "+u2.getHp());
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1", 100, 10);
		Zealot z2 = new Zealot("����2", 100, 10);
		Dragoon d1 = new Dragoon("���1", 100, 20);
		DarkTempler dt1 = new DarkTempler("��ũ���÷�1", 100, 50);
		
		attack(z1, z2);
		attack(z1, d1);
		attack(z1, dt1);
		attack(dt1, z2);
	}

}


