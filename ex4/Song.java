package ex4;

class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	void show() {
		System.out.println(year +"�� " + country + "������ " + artist + "�� �θ� " + title);
	}
	
	public Song() {
	}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public static void main(String[] args) {
		Song s = new Song("Dansing Queen", "ABBA", 1978, "������");
		s.show();

	}

}
