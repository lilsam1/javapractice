package ch_04_control;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���α׷��� ������ �ִ� ������ ����ڰ� �˾Ƹ����� ����
		 1) 1���� 1000 ������ ���� �ϳ��� �����Ѵ�
		 2) ����ڰ� ���� �����Ͽ� �Է��Ѵ�
		 3) ������ �ƴ� ���, ������ �Է��� ������ ū�� ������ �˷��ش�
		 4) ������ ���, ���� �޽��� �� �õ� Ƚ�� ����� ��
		 */
		
		//int nextInt(int n); //int Ÿ���� 0 ~ �Ű��������� ������ ����
//		Random random = new Random();
//		answer = random.nextInt(999) + 1;
		
		Scanner sc = new Scanner(System.in);
		int value;
		int count = 0;
		int random = (int)(Math.random() * 999) + 1;
		
		while(true) {
			count++;
			System.out.println("������ �����غ�����");
			value = sc.nextInt();
			
			if (value == random) {
				break;
				}
			else if(value > random) {
				System.out.println("������ ������ �����ϴ�");	
			}
			else if(value < random) {
				System.out.println("������ ������ �����ϴ�");
			}
		}
		System.out.println("�����Դϴ�. ���ݱ��� " + count + "�� �õ��ϼ̽��ϴ�.");
	}

}
