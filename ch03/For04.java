package ch03;

public class For04 {

	public static void main(String[] args) {
//		System.out.println("*****");
//		System.out.println("****");
//		System.out.println("***");
//		System.out.println("**");
//		System.out.println("*");		
		
		System.out.println("1¹ø");
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//
		
		System.out.println("");
		
		
		System.out.println("2¹ø");
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				if(j + i <= 5) {
					System.out.print("*");
				}	
			}
			System.out.println("");
		}				
		//

		
		
		System.out.println("");
		
		
		System.out.println("3¹ø");
		for(int i = 1; i <= 5; i++) {
			if(i % 2 == 1) {
				if(!(i % 3 == 0)) {
					System.out.print(" ");
				}

				for(int j = 0; j < i; j++) {
					if(j + i <= 5) {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
			
		}

	}
		
		
}

