package shoppingmall_ex;

import java.util.Scanner;

public class MemberInsert {
	Scanner stdin = new Scanner(System.in);
	Member member;
	MemberInsert(String memberID, String password, String name) {
		member = new Member(memberID, password, name);
	}
	
	 void updateAddInfo() {
		boolean isMore = true;
		 
		System.out.println("�߰� ������ �Է��Ͻðڽ��ϱ�?");
		do {
			System.out.println("�߰� ������ �Է��Ͻ÷��� Y, �׸��ϽǷ��� N�� �Է��� �ֽʽÿ�>>>");
			String answer = stdin.nextLine();
			if(answer.equals("Y") || answer.equals("N")) {
				isMore = false;
				if (answer.equals("Y")) {
					System.out.println("�ּҸ� �Է����ֽʽÿ�>>> ");
					String address = stdin.nextLine();
					member.setAddress(address);
					System.out.println("�̸����� �Է����ֽʽÿ�>>> ");
					String email = stdin.nextLine();
					member.setEmail(email);	
				}
			} else {
				System.out.println("�߸��� �Է��Դϴ�");
			}
		} while (isMore);
		}
	
	void printMemberInfo() {																						//		Member m = new Member(this.getMemberID(), "address", "address");	// bullshit
		System.out.println(member);
	}
	

	void login() {
		String memberID, password;
		System.out.println("�α��� ������ �Է��� �ּ���");
		do {
			System.out.println("���̵� �Է��� �ּ��� >>>");
			memberID = stdin.nextLine();
			System.out.println("��й�ȣ�� �Է��� �ּ���");
			password = stdin.nextLine();
		}
		while (!confirmLogin(memberID, password));
		}
	
	private boolean confirmLogin(String memberID, String password) {
		if (member.getMemberID().equals(memberID) && member.getPassword().equals(password)) {
			System.out.println("�α��� �Ǿ����ϴ�");
			return true;
		}
		else {
			System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�");
			return false;
		}
	
	}

}
