package ch_04_control;

import java.util.Scanner;

public class If_exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��� �ּ���.");
		id = sc.nextLine();
		
		if (id.equals("java")) {
			System.out.println("���̵� ��ġ");
			System.out.println("��й�ȣ�� �Է����ּ���");
			password = sc.nextLine();
			if (password.equals("abc123")) {
				System.out.println("��й�ȣ ��ġ");
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("��й�ȣ ����ġ");
			}
		}
		else {
			System.out.println("���̵� ����ġ");
		}
		sc.close();

	}

}
