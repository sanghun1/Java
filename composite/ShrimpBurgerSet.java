package composite;

import lombok.Data;

@Data

public class ShrimpBurgerSet {
	private ShrimpBurger shrimpBurger;
	private Potato potato;
	private Coke coke;
	
	public ShrimpBurgerSet() {
		this(
			new ShrimpBurger(),
			new Potato(),
			new Coke()
				);
	}

	public ShrimpBurgerSet(ShrimpBurger shrimpBurger, Potato potato, Coke coke) {
		super();
		this.shrimpBurger = shrimpBurger;
		this.potato = potato;
		this.coke = coke;
	}
	
	
	
	
}
