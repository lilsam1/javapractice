package ch_06_method;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 login() �޼���� logout() �޼��带 �����Ϸ��� �մϴ�
		 login() �޼��带 ȣ���� ���� �Ű������� id�� password�� �����ϰ�
		 lgout() �޼���� id�� �Ű������� �����մϴ�
		 
		 1) login() �޼���� �Ű��� id�� "admin", �Ű��� password�� "1234"�� ��쿡�� true�� �����ϰ�
		 �� ���� ���� ��쿡�� false�� �����ϵ��� �ϼ���
		 2) logout() �޼���� "�α׾ƿ� �Ǿ����ϴ�"�� ��µǵ��� �ϼ���
		 */
		
		Scanner scanner = new Scanner(System.in);
		String id, password;
		System.out.print("���̵� �Է����ּ���. >> ");
		id = scanner.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���. >> ");
		password = scanner.nextLine();
		
		boolean result = Login(id, password);
		 if (result) {
			 System.out.println("�α��� �Ǿ����ϴ�");
			 Logout(id);
		 }
		 else {
			 System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
		 }

	}
	
	static boolean Login(String id, String password) {
		return(id.equals("admin") && password.equals("1234"));
	}
	
	static void Logout(String id) {
		System.out.println("�α׾ƿ� �Ͽ����ϴ�");
	}


}
