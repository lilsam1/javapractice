package shoppingmall_notend;

import java.util.Scanner;

public class MemberInsert extends Member {
	Scanner stdin = new Scanner(System.in);

	public MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
		// TODO Auto-generated constructor stub
	}
	
	public void updateAddInfo() {
		System.out.println("�߰� ������ �Է��Ͻðڽ��ϱ�?");
		System.out.println("�߰� ������ �Է��Ͻ÷��� Y, �׸��ϽǷ��� N�� �Է��� �ֽʽÿ�>>>");
		String yn = stdin.nextLine();
		if(yn.equals("y")) {
			System.out.println("�ּҸ� �Է����ֽʽÿ�>>> ");
			String address = stdin.nextLine();
			this.setAddress(address);
			System.out.println("�̸����� �Է����ֽʽÿ�>>> ");
			String email = stdin.nextLine();
			this.setEmail(email);
		}
		if(yn.equals("n")) {  }	
	}
	
	public void printMemberInfo() {
																									//		Member m = new Member(this.getMemberID(), "address", "address");	// bullshit
		System.out.println(this.toString());
	}
	

	void login() {
		System.out.println("�α��� ������ �Է��� �ּ���");
		System.out.println();
		System.out.println("���̵� �Է��� �ּ��� >>>");
		String memberID = stdin.nextLine();
		System.out.println("��й�ȣ�� �Է��� �ּ���");
		String password = stdin.nextLine();
		
		if(super.getMemberID() == this.getMemberID() && super.getPassword() == this.getPassword() ) {
			System.out.println("�α��ο� �����Ͽ����ϴ�");
		}
	}

}
