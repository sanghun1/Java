package star1;


// 1. ������ ��� ��ũ SCV ��ũ���÷� Ÿ�� -> StarUnit Ÿ��
public class Star3App {

	static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.name + " -> " + u2.name+ "����");
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name + " ü�� : " + u2.hp);
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1", 100, 10);
		Dragoon d1 = new Dragoon("���1", 100, 20);
		Dragoon d2 = new Dragoon("���2", 100, 20);
		DarkTempler dt1 = new DarkTempler("��ũ���÷�1", 100, 50);
		DarkTempler dt2 = new DarkTempler("��ũ���÷�2", 100, 50);
		SCV s1 = new SCV("SCV1", 50, 5);
		Tank t1 = new Tank("��ũ1", 200, 30);
		
		// 1. ����1 -> ���1 ����
		attack(z1, d1);
		
		// 2. ���1 -> ����1 ����
		attack(d1, z1);
		
		// 3. ���1 -> ���2 ����
		attack(d1, d2);
		
		// 4. ��ũ���÷�1 -> ����1 ����
		attack(dt1, z1);
		
		// 5. ��ũ���÷�2 -> ���1 ����
		attack(dt2, d1);
		
		// 6. ��ũ1 -> SCV1 ����
		attack(t1, s1);
	}

}
