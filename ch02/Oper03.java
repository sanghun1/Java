package ch02;

public class Oper03 {

	public static void main(String[] args) {
		//�� ���� (��� boolean)
		System.out.println(1==1);
		System.out.println(1==2);
		
		boolean s = (1==1); // Ÿ���� ��ġ
		
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
