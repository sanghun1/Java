package star2;


//1. Zealot, Dragoon, Tank, Scv, DarkTempler = > StarUnit 타입 일치

public class Star3App {

	// u1 -> u2 를 공격
	static void attack(StarUnit u1, StarUnit u2) {
		// 1. hp를 수정할 수 있는 함수 setHp(int hp)
		// 2. hp의 값을 확인하는 함수 getHp()
		// 3. attack의 값을 확인하는 함수 getAttack()
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName()+" 체력 : "+u2.getHp());
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1", 100, 10);
		Zealot z2 = new Zealot("질럿2", 100, 10);
		Dragoon d1 = new Dragoon("드라군1", 100, 20);
		DarkTempler dt1 = new DarkTempler("다크템플러1", 100, 50);
		
		attack(z1, z2);
		attack(z1, d1);
		attack(z1, dt1);
		attack(dt1, z2);
	}

}


