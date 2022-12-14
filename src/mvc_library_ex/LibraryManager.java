package mvc_library_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
	private ArrayList<Library> list;
	private Scanner stdin;
	
	public LibraryManager() {
		list = new ArrayList<Library>();
		stdin = new Scanner(System.in);
	}
	
	// 1. 책 등록
	public void addBook() {
		Library library = new Library();
		
		System.out.print("코드 : ");
		library.setCode(stdin.nextInt());
		
		System.out.print("제목 : ");
		library.setTitle(stdin.next());
		
		System.out.print("작가 : ");
		library.setAuthor(stdin.next());
		
		System.out.println("재고 숫자 : ");
		library.setStock(stdin.nextInt());
		
		list.add(library);
		
		System.out.println("책이 등록되었습니다");
		System.out.println(list.toString() + "\t");
	}
	
	
	// 2. 책 검색
//	public void searchBook() {
//		System.out.println("검색할 책을 적어주세요");
//		System.out.print("제목: ");
//		String title = stdin.next();
//		
//		for(Library library : list) {
//			if (library.getName().equals(title)) {
//				System.out.println(list.toString());;
//			}
//			else {
//				System.out.println("일치하는 책을 찾지 못했습니다");
//			}
//		}
//	}
	
	// 2. 책 검색 - 키워드로 검색되도록 
	public void searchBook() {
		System.out.println("검색할 책을 적어주세요");
		System.out.print("제목: ");
		String title = stdin.next();
		
		ArrayList<Library> searchlist = new ArrayList<>();
		for (Library library : list) {
			if (library.getTitle().contains(title)) {
				searchlist.add(library);
			}
		}
		if (searchlist.size() < 1 ) {
			System.out.println("검색된 책이 없습니다");
		}
		else {
			System.out.println("검색한 책의 정보는 아래와 같습니다");
			for (Library library : searchlist) {
				System.out.println(library);
			}
		}
	}
	
	// 3. 책 대여
	public void rentalBook() {
		System.out.print("코드 : ");
		int code = stdin.nextInt();
		
		System.out.print("대여 권수 : ");
		int stock = stdin.nextInt();
		
		
		for (Library library : list) {
			if (library.getCode() == code ) {
				if (library.getStock() < stock) {
					System.out.println("재고가 충분하지 않아 대여할 수 없습니다");
				}
				else {
					library.setStock(library.getStock() - stock);
					System.out.println(stock + "권이 대여되었습니다");
				}
				return;
			}
		}
	}
	
	// 4. 책 반납
	public void returnBook() {
		System.out.print("코드 : ");
		int code = stdin.nextInt();
		
		System.out.println("반납 권수: ");
		int back = stdin.nextInt();
		
		for (Library library : list) {
				library.setStock(back + library.getStock());
				System.out.println(back + "권이 반납되었습니다");
				return;
		}
		
	}

	// 5. 책 전체출력
	public void display() {
		for (Library account : list) {
			System.out.println(
					account.getCode() + "\t" + 
					account.getTitle() + "\t" + 
					account.getAuthor() + "\t" +
					account.getStock());
		}
	}
}
