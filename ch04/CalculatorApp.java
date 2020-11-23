package ch04;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int a1 = c.add(10, 5);
			a1 = c.multi(a1, 20);
			a1 = c.divid(a1, 5);
		 	a1 = c.minus(a1, 100);
		
		System.out.println(a1);
		
	}

}
