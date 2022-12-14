package mvc_book_db;

import java.util.Scanner;

public class BookView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager manager = new BookManager();
		Scanner stdin = new Scanner(System.in);
		
		while (true) {
			printMenu();
			System.out.print("����:");
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
					System.out.println("��ϵ� å�� ������ �Ʒ��� �����ϴ�");
					manager.display();
					break;
				case 6:
					manager.disConnect();
					System.out.println("���� ��ư�� �����̽��ϴ�. �����մϴ�");
					stdin.close();
					break;
				default:
					System.out.println("�߸������̽��ϴ�.\n�ٽü������ּ���");
					break;
			}
		}

	}

	public static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("==============Menu==============");
		System.out.println("1. å ���");
		System.out.println("2. å �˻�");
		System.out.println("3. å �뿩");
		System.out.println("4. å �ݳ�");
		System.out.println("5. å ��ü���");
		System.out.println("6. ����");
		System.out.println();
	}

}
