package ex4;

class Tv {
	private String name;
	private int year;
	private int size;
	
	void show(){
		System.out.println(name + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
	public Tv() {
		// TODO Auto-generated constructor stub
	}
	
	public Tv(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}

	public static void main(String[] args) {
		Tv myTv = new Tv("LG", 2017, 32);
		myTv.show();

	}

}
