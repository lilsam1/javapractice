package shoppingmall_ex;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);	// �ܼ� �Է� ���
		ShopProduct sp = new ShopProduct();	// ��ǰ ����
		ShopCart sc = new ShopCart();
		
		System.out.println("01. ȸ�� ���� ����");
		System.out.println("ȸ�� ���� ������ �Է��ϼ���");
		
		System.out.print("���̵�: ");
		String memberID = stdin.nextLine();
		System.out.print("��й�ȣ: ");
		
		String password = stdin.nextLine();
		System.out.print("�̸�: ");
		String name =  stdin.nextLine();
		
//		String memberID = "abc";
//		String password = "1234";
//		String name = "�׽�Ʈ";
		
		// ȸ�� ���� ���� Ŭ������ �����ڿ��� ���̵�, ��й�ȣ, �̸� ����
		MemberInsert m = new MemberInsert(memberID, password, name);
		m.updateAddInfo();	// �߰� ���� �Է�
		m.printMemberInfo();	// ȸ�� ���� ���� ���
		System.out.println("ȸ�� ������ �ּż� �����մϴ�");
		System.out.println("01. ȸ�� ���� ����");
		System.out.println("");
		
		System.out.println("02. �α��� ����");
		m.login();	// �α��� ó��
		System.out.println("02. �α��� ����");
		System.out.println("");
		
		System.out.println("03. ��ٱ��� ����");
		System.out.println("�������� ���� ������ ��ǰ�Դϴ�");
		sp.printProduct();	// ��ǰ ����
		sc.selectProduct();	// ��ǰ�� ����
		System.out.println("��ٱ��Ͽ� ���� ��ǰ�� �Ʒ��� �����ϴ�");
		sc.printCart();	// ��ٱ��Ͽ� ���� ��ǰ ���
		System.out.println("03. ��ٱ��� ����");
		System.out.println();

	}

}
