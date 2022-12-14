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
	
	// 1. 책 등록
	public void addBook() {
		
		System.out.println("등록할 책의 정보를 입력해주세요");
		Book book = new Book();
		
		System.out.print("코드 : ");
		book.setCode(stdin.nextInt());
		
		System.out.print("제목 : ");
		book.setTitle(stdin.next());
		
		System.out.print("작가 : ");
		book.setAuthor(stdin.next());
		
		System.out.println("재고 숫자 : ");
		book.setStock(stdin.nextInt());
		
		if(bookDAO.insertCode(book)) {
			System.out.println("책 정보가 등록되었습니다");
		}
		else {
			System.out.println("다시 입력해주세요");
		}
	}
	
	
	
	// 2. 책 검색
	public void search() {
		System.out.println("검색할 책의 제목을 적어주세요");
		System.out.print("제목: ");
		String title = stdin.next();
		
		Book book = bookDAO.selectOne(title);
		if (book != null) {
			System.out.println(book.getCode() + "\t" + book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getStock());
		}
		else {
			System.out.println("해당 코드의 책은 존재하지 않습니다");
		}
		
//		ArrayList<Book> searchlist = new ArrayList<>();
//		for (Book b : list) {
//			if (b.getTitle().contains(title)) {
//				searchlist.add(b);
//			}
//		}
//		if (searchlist.size() < 1 ) {
//			System.out.println("검색된 책이 없습니다");
//		}
//		else {
//			System.out.println("검색한 책의 정보는 아래와 같습니다");
//			for (Book b : searchlist) {
//				System.out.println(b);
//			}
//		}
	}
	
	// 코드로 책 찾기
	private Book searchBook(int code) {
		Book book = null;
		for (Book b : list) {
			if(b.getCode() == code) {
				book = b;
			}
		}
		return book;
	}
	
	// 3. 책 대여
	public void rentalBook() {
		System.out.println("대여할 책의 코드를 입력해 주세요");
		System.out.print("코드 : ");
		int code = stdin.nextInt();
		
		System.out.print("대여 권수 : ");
		int stock = stdin.nextInt();
		
		if (bookDAO.isCode(code)) {
			Book book = bookDAO.selectOne(code);
			if (book.getStock() < stock) {
				System.out.println("재고가 충분하지 않아 대여할 수 없습니다");
			}
			else {
				bookDAO.updateStock(code, stock, false);
				System.out.println(stock + "권이 대여되었습니다");
			}
			return;
		}
		else {
			System.out.println("해당 코드의 책은 존재하지 않습니다");
		}
		
//		Book book = searchBook(code);
//		if (book == null) {
//			System.out.println("입력한 코드의 책은 없습니다");
//			return;
//		}
//		if (book.getStock() < stock) {
//			System.out.println("재고가 충분하지 않아 대여할 수 없습니다");
//			return;
//		}
//		book.setStock(book.getStock() - stock);
//		System.out.println(stock + "권이 대여되었습니다");
		
	}
	
	// 4. 책 반납
	public void returnBook() {
		System.out.println("반납할 책의 코드를 입력하세요");
		System.out.print("코드 : ");
		int code = stdin.nextInt();
		
		System.out.println("반납 권수: ");
		int stock = stdin.nextInt();
		
		if (bookDAO.isCode(code)) {
			bookDAO.updateStock(code, stock, true);
			System.out.println(stock + "권이 반납되었습니다");
		}
		else {
			System.out.println("해당 코드의 책은 존재하지 않습니다");
		}
		
//		Book book = searchBook(code);
//		if (book == null) {
//			System.out.println("입력한 코드의 책은 없습니다");
//			return;
//		}
//		book.setStock(book.getStock() + stock);
//		System.out.println(stock + "권이 반납되었습니다");
		
	}

	// 5. 책 전체출력
	public void display() {
		ArrayList<Book> list = bookDAO.selectAll();
		for (Book book : list) {
			System.out.println(book);
		}
		
	}
}
