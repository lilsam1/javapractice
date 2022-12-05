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
	 ���� ������
	 �뷡 �� ���� ��Ÿ���� Ŭ���� Song�� �ۼ�
	 this()�� ���
	 Song Ŭ������ ������ ���� ���ǵȴ�
	 	#�ʵ�
	 		title : �뷡�� ����
	 		artist : ����
	 		length : ���� ���� (����: ��)
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
