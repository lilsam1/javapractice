package mvc_book_db;

/* DTO(Data Transfer Object), VO(Value Object)
 로직을 갖고 있지 않는 순수한 데이터 객체이며 속성과 그 속성에 접근하기 위한 getter, setter 메서드만 가진 클래스
 */
public class Book {
	private int code;		// 코드
	private String title;	// 제목
	private String author;	// 작가
	private int stock;		// 재고숫자
	
	public Book() {
		
	}

	public Book(int code, String title, String author, int stock) {
		this.code = code;
		this.title = title;
		this.author = author;
		this.stock = stock;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book" + "\n" +
				"코드 : " + code + "\n" +
				"제목 : " + title + "\n" +
				"작가 : " + author + "\n" + 
				"재고 숫자 : " + stock
		;
	}
	
	
	
	

}
