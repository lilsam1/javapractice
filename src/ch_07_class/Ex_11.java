package ch_07_class;

class Song {
	String title;
	String artist;
	int length;
	
	public Song() {
	}
	
	public Song(String title) {
		this.title = title;	
	}
	
	public Song(String title, String artist) {
		this(title);
		this.artist = artist;
	}
	
	public Song(String title, String artist, int length) {
		this(title, artist);
		this.length = length;
	}
		
	public String toString() {
		return "song{title=" + title + ", artist=" + artist + ", length=" + length + "}";
	}
}

public class Ex_11 {
	/*
	 다중 생성자
	 노래 한 곡을 나타내는 클래스 Song을 작성
	 this()를 사용
	 Song 클래스는 다음과 같이 정의된다
	 	#필드
	 		title : 노래의 제목
	 		artist : 가수
	 		length : 곡의 길이 (단위: 초)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1 = new Song("Outward Bound", "Nana", 180);
		Song song2 = new Song("Jambalya", "Carpenters");
		Song song3 = new Song("Yesterday");
		Song song4 = new Song();
		
		System.out.println(song1);	// song{title='Outward Bound', artist='nana', lengh = 180};
		System.out.println(song2);	// song{title='Jambalya', artist='Carpenters', lengh = 0};
		System.out.println(song3);	// song{title='Yesterday', artist='null', lengh = 0};
		System.out.println(song4);	// song{title='null', artist='null', lengh = 0};

	}

}
