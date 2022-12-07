package ch_14_collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* ���̵�� ��й�ȣ �˻��ϱ�
 ���̵�� ��й�ȣ �Է��� �޾� map�� ����� ���� �񱳸� �ؼ�
 1) ������ ���̵� ����� �ִ� ��쿡�� "�α��εǾ����ϴ�"
 2) ������ ���̵�� �ִµ� ����� Ʋ�� ��� "��й�ȣ�� ��ġ���� �ʽ��ϴ�"
 3) ������ ���̵� ������ "�Է��Ͻ� ���̵� �������� �ʽ��ϴ�"�� ��µǵ��� �ض� 
 */

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();	// Ű�� ������ String ���
		
		// ���̵�� ��й�ȣ�� �̸� ����
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.println("���̵� : ");
			String id = scanner.nextLine();
			System.out.println("��й�ȣ : ");
			String password = scanner.nextLine();
			System.out.println();
			
			// �ۼ���ġ
			if(map.containsKey(id)) {	// ���̵��� Ű�� �����ϴ��� Ȯ��
				if (map.get(id).equals(password)) {	// Ű�� id�� value�� �Է��� ��й�ȣ ���ڿ� ��
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				}
				else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
			}
			else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�");
			}
		}

	}

}
