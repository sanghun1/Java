package star1;

public class Marine {
	private String name;
	private int hp;
	private int attack;
	//맴버변수 : 필드 : heap변수 : 전역변수 : 속성 : 프로퍼티
	//field, property는 private로 만든다
	
	
	// this는 heap을 가르킨다
	public Marine(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	// alt + shift + s
	
	public Marine() {
	}
}
