package ch04;

class Jobs{

}

class Police extends Jobs{
	private String name = "����";



	
}

class Docter extends Jobs{
	private String name = "�ǻ�";
	

	
}
public class Array02 {

	public static void main(String[] args) {
		Jobs[] jobs = new Jobs[2];
		jobs[0] = new Police();
		jobs[1] = new Docter();
		
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);

	}

}
