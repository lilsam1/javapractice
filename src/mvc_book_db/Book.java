package mvc_book_db;

/* DTO(Data Transfer Object), VO(Value Object)
 ������ ���� ���� �ʴ� ������ ������ ��ü�̸� �Ӽ��� �� �Ӽ��� �����ϱ� ���� getter, setter �޼��常 ���� Ŭ����
 */
public class Book {
	private int code;		// �ڵ�
	private String title;	// ����
	private String author;	// �۰�
	private int stock;		// ������
	
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
				"�ڵ� : " + code + "\n" +
				"���� : " + title + "\n" +
				"�۰� : " + author + "\n" + 
				"��� ���� : " + stock
		;
	}
	
	
	
	

}
