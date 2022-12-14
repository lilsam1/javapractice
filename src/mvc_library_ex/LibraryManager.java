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
	
	// 1. å ���
	public void addBook() {
		Library library = new Library();
		
		System.out.print("�ڵ� : ");
		library.setCode(stdin.nextInt());
		
		System.out.print("���� : ");
		library.setTitle(stdin.next());
		
		System.out.print("�۰� : ");
		library.setAuthor(stdin.next());
		
		System.out.println("��� ���� : ");
		library.setStock(stdin.nextInt());
		
		list.add(library);
		
		System.out.println("å�� ��ϵǾ����ϴ�");
		System.out.println(list.toString() + "\t");
	}
	
	
	// 2. å �˻�
//	public void searchBook() {
//		System.out.println("�˻��� å�� �����ּ���");
//		System.out.print("����: ");
//		String title = stdin.next();
//		
//		for(Library library : list) {
//			if (library.getName().equals(title)) {
//				System.out.println(list.toString());;
//			}
//			else {
//				System.out.println("��ġ�ϴ� å�� ã�� ���߽��ϴ�");
//			}
//		}
//	}
	
	// 2. å �˻� - Ű����� �˻��ǵ��� 
	public void searchBook() {
		System.out.println("�˻��� å�� �����ּ���");
		System.out.print("����: ");
		String title = stdin.next();
		
		ArrayList<Library> searchlist = new ArrayList<>();
		for (Library library : list) {
			if (library.getTitle().contains(title)) {
				searchlist.add(library);
			}
		}
		if (searchlist.size() < 1 ) {
			System.out.println("�˻��� å�� �����ϴ�");
		}
		else {
			System.out.println("�˻��� å�� ������ �Ʒ��� �����ϴ�");
			for (Library library : searchlist) {
				System.out.println(library);
			}
		}
	}
	
	// 3. å �뿩
	public void rentalBook() {
		System.out.print("�ڵ� : ");
		int code = stdin.nextInt();
		
		System.out.print("�뿩 �Ǽ� : ");
		int stock = stdin.nextInt();
		
		
		for (Library library : list) {
			if (library.getCode() == code ) {
				if (library.getStock() < stock) {
					System.out.println("��� ������� �ʾ� �뿩�� �� �����ϴ�");
				}
				else {
					library.setStock(library.getStock() - stock);
					System.out.println(stock + "���� �뿩�Ǿ����ϴ�");
				}
				return;
			}
		}
	}
	
	// 4. å �ݳ�
	public void returnBook() {
		System.out.print("�ڵ� : ");
		int code = stdin.nextInt();
		
		System.out.println("�ݳ� �Ǽ�: ");
		int back = stdin.nextInt();
		
		for (Library library : list) {
				library.setStock(back + library.getStock());
				System.out.println(back + "���� �ݳ��Ǿ����ϴ�");
				return;
		}
		
	}

	// 5. å ��ü���
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
