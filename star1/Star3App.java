package star1;


// 1. 질럿과 드라군 탱크 SCV 다크템플러 타입 -> StarUnit 타입
public class Star3App {

	static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.name + " -> " + u2.name+ "공격");
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name + " 체력 : " + u2.hp);
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1", 100, 10);
		Dragoon d1 = new Dragoon("드라군1", 100, 20);
		Dragoon d2 = new Dragoon("드라군2", 100, 20);
		DarkTempler dt1 = new DarkTempler("다크템플러1", 100, 50);
		DarkTempler dt2 = new DarkTempler("다크템플러2", 100, 50);
		SCV s1 = new SCV("SCV1", 50, 5);
		Tank t1 = new Tank("탱크1", 200, 30);
		
		// 1. 질럿1 -> 드라군1 공격
		attack(z1, d1);
		
		// 2. 드라군1 -> 질럿1 공격
		attack(d1, z1);
		
		// 3. 드라군1 -> 드라군2 공격
		attack(d1, d2);
		
		// 4. 다크템플러1 -> 질럿1 공격
		attack(dt1, z1);
		
		// 5. 다크템플러2 -> 드라군1 공격
		attack(dt2, d1);
		
		// 6. 탱크1 -> SCV1 공격
		attack(t1, s1);
	}

}
