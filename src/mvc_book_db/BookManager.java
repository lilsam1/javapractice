package mvc_book_db;

import java.util.ArrayList;
import java.util.Scanner;

import mvc_account._db.AccountDAO;
import mvc_account._db.AccountDTO;

public class BookManager {
	private ArrayList<Book> list;
	private Scanner stdin;
	private BookDAO bookDAO;
	
	public BookManager() {
		bookDAO = new BookDAO();
		list = new ArrayList<Book>();
		stdin = new Scanner(System.in);
	}
	
	public void disConnect() {
		bookDAO.disConnect();
	}
	
	// 1. å ���
	public void addBook() {
		
		System.out.println("����� å�� ������ �Է����ּ���");
		Book book = new Book();
		
		System.out.print("�ڵ� : ");
		book.setCode(stdin.nextInt());
		
		System.out.print("���� : ");
		book.setTitle(stdin.next());
		
		System.out.print("�۰� : ");
		book.setAuthor(stdin.next());
		
		System.out.println("��� ���� : ");
		book.setStock(stdin.nextInt());
		
		if(bookDAO.insertCode(book)) {
			System.out.println("å ������ ��ϵǾ����ϴ�");
		}
		else {
			System.out.println("�ٽ� �Է����ּ���");
		}
	}
	
	
	
	// 2. å �˻�
	public void search() {
		System.out.println("�˻��� å�� ������ �����ּ���");
		System.out.print("����: ");
		String title = stdin.next();
		
		Book book = bookDAO.selectOne(title);
		if (book != null) {
			System.out.println(book.getCode() + "\t" + book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getStock());
		}
		else {
			System.out.println("�ش� �ڵ��� å�� �������� �ʽ��ϴ�");
		}
		
//		ArrayList<Book> searchlist = new ArrayList<>();
//		for (Book b : list) {
//			if (b.getTitle().contains(title)) {
//				searchlist.add(b);
//			}
//		}
//		if (searchlist.size() < 1 ) {
//			System.out.println("�˻��� å�� �����ϴ�");
//		}
//		else {
//			System.out.println("�˻��� å�� ������ �Ʒ��� �����ϴ�");
//			for (Book b : searchlist) {
//				System.out.println(b);
//			}
//		}
	}
	
	// �ڵ�� å ã��
	private Book searchBook(int code) {
		Book book = null;
		for (Book b : list) {
			if(b.getCode() == code) {
				book = b;
			}
		}
		return book;
	}
	
	// 3. å �뿩
	public void rentalBook() {
		System.out.println("�뿩�� å�� �ڵ带 �Է��� �ּ���");
		System.out.print("�ڵ� : ");
		int code = stdin.nextInt();
		
		System.out.print("�뿩 �Ǽ� : ");
		int stock = stdin.nextInt();
		
		if (bookDAO.isCode(code)) {
			Book book = bookDAO.selectOne(code);
			if (book.getStock() < stock) {
				System.out.println("��� ������� �ʾ� �뿩�� �� �����ϴ�");
			}
			else {
				bookDAO.updateStock(code, stock, false);
				System.out.println(stock + "���� �뿩�Ǿ����ϴ�");
			}
			return;
		}
		else {
			System.out.println("�ش� �ڵ��� å�� �������� �ʽ��ϴ�");
		}
		
//		Book book = searchBook(code);
//		if (book == null) {
//			System.out.println("�Է��� �ڵ��� å�� �����ϴ�");
//			return;
//		}
//		if (book.getStock() < stock) {
//			System.out.println("��� ������� �ʾ� �뿩�� �� �����ϴ�");
//			return;
//		}
//		book.setStock(book.getStock() - stock);
//		System.out.println(stock + "���� �뿩�Ǿ����ϴ�");
		
	}
	
	// 4. å �ݳ�
	public void returnBook() {
		System.out.println("�ݳ��� å�� �ڵ带 �Է��ϼ���");
		System.out.print("�ڵ� : ");
		int code = stdin.nextInt();
		
		System.out.println("�ݳ� �Ǽ�: ");
		int stock = stdin.nextInt();
		
		if (bookDAO.isCode(code)) {
			bookDAO.updateStock(code, stock, true);
			System.out.println(stock + "���� �ݳ��Ǿ����ϴ�");
		}
		else {
			System.out.println("�ش� �ڵ��� å�� �������� �ʽ��ϴ�");
		}
		
//		Book book = searchBook(code);
//		if (book == null) {
//			System.out.println("�Է��� �ڵ��� å�� �����ϴ�");
//			return;
//		}
//		book.setStock(book.getStock() + stock);
//		System.out.println(stock + "���� �ݳ��Ǿ����ϴ�");
		
	}

	// 5. å ��ü���
	public void display() {
		ArrayList<Book> list = bookDAO.selectAll();
		for (Book book : list) {
			System.out.println(book);
		}
		
	}
}
