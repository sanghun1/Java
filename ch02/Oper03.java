package ch02;

public class Oper03 {

	public static void main(String[] args) {
		//비교 연산 (결과 boolean)
		System.out.println(1==1);
		System.out.println(1==2);
		
		boolean s = (1==1); // 타입을 일치
		
		System.out.println('a' > 'b'); // false
		System.out.println(3 >= 2); // false
		System.out.println(-1 < 0); // true
		System.out.println(3.45 <= 2); // false
		System.out.println(3 == 2); // false
		System.out.println(3 != 2); // true
		System.out.println(!(3 != 2)); // false
		
		System.out.println((3 > 2) && (3 > 4)); //false
		System.out.println((3 != 2) || (-1 > 0)); // true
		System.out.println((3 != 2) ^ (-1 > 0)); // true

	}

}
