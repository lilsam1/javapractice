package mvc_library_ex;

import java.util.Scanner;

public class LibraryView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryManager manager = new LibraryManager();
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
					manager.searchBook();
					break;
				case 3:
					manager.rentalBook();
					break;
				case 4:
					manager.returnBook();
					break;
				case 5:
					System.out.println("�ڵ�\t����\t�۰�\t���");
					manager.display();
					break;
				case 6:
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
