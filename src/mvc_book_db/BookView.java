package mvc_book_db;

import java.util.Scanner;

public class BookView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager manager = new BookManager();
		Scanner stdin = new Scanner(System.in);
		
		while (true) {
			printMenu();
			System.out.print("선택:");
			int choice = stdin.nextInt();
			switch(choice) {
				case 1:
					manager.addBook();
					break;
				case 2:
					manager.search();
					break;
				case 3:
					manager.rentalBook();
					break;
				case 4:
					manager.returnBook();
					break;
				case 5:
					System.out.println("등록된 책의 정보는 아래와 같습니다");
					manager.display();
					break;
				case 6:
					manager.disConnect();
					System.out.println("종료 버튼을 누르셨습니다. 종료합니다");
					stdin.close();
					break;
				default:
					System.out.println("잘못누르셨습니다.\n다시선택해주세요");
					break;
			}
		}

	}

	public static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("==============Menu==============");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 책 대여");
		System.out.println("4. 책 반납");
		System.out.println("5. 책 전체출력");
		System.out.println("6. 종료");
		System.out.println();
	}

}
