package ch02;

//�ڹٴ� .class ������ �����ϸ� static �κ��� �޸𸮿� �ε��Ѵ�. (static����)
//static ������ �ִ� main()�Լ��� ã�Ƽ� ȣ���ϰ�
//�̶� stack�� �����Ǵµ� �� stack�� �̸��� main�̶�� �Ѵ�.
//main�� stack ����Ǹ� ���α׷� ����
public class Var02 {

	public static void main(String[] args) {
		int num  = 10; // 4Byte - 32bit - 41�� 9õ (-20�� ~ 20��)
		long num2 = 100; // 8Byte
		
		char s = 'A'; // 2Byte char
		
		double d = 7.5; // 8Byte 41�� 9õ (-20�� ~ 20��)�߰� �Ҽ��� ����
		
		boolean b = true; // 1bit
		
		num = (int)d; // ����� ����ȯ (�ٿ� ĳ���� - �ڷ� ����)
		num = (int)num2; // ����� ����ȯ ( �ٿ� ĳ���� )
		num2 = num; // ������ ����ȯ (�� ĳ����)
	}
//stack �Լ��� ȣ��� �� �����Ǵ� �� �Լ��� ����� �� ������� ��
}
