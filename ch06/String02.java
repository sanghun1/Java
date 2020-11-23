package ch06;

public class String02 {

	public static void main(String[] args) {
		String java = "Java";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		if(res == 0)
			System.out.println("the same");
		else if(res < 0)
			System.out.println(java + " < " + cpp);
		else
			System.out.println(java + " > " + cpp);
		
		System.out.println("abcd" + 1 + true + 3.13e-2 + 'E' + "fgh");
		
		String love = "I Love";
		System.out.println(love.concat(" Java."));
		
		String a = "                  abcd           def       ";
		String b = "             xyz\tsdaf";
		String c = a.trim();
		String d = b.trim();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		String a1 = "class";
		char c1 = a1.charAt(2);
		
		System.out.println(c1);
		
		int count = 0;
		String a2 = "class";
		for (int i = 0; i < a2.length(); i++) {
			if(a2.charAt(i) == 's')
				count++;
		}
		System.out.println(count);
	}
}
