package ch_13_java.lang;

// book1 ��ü�� book2�� ������ �� �ְ� clone() �޼��带 �������̵�

class MyBook implements Cloneable{
	String title;
	
	public MyBook(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class Ex_02 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MyBook book1 = new MyBook("�ڹ�");
		MyBook book2 = (MyBook) book1.clone();
		
		System.out.println(book2.title);

	}

}
