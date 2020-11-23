package composite;

import lombok.Data;

@Data
public class ShrimpBurger {
	private int price;
	private String desc;
	
	
	public ShrimpBurger() {
		this(2500, "새우버거");
	}
	
	public ShrimpBurger(int price, String desc) {
		this.price = price;
		this.desc = desc;
		
		System.out.println(desc + "가 만들어졌습니다.");
	}
	
	
}
