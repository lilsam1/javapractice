package ch_03_operator;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ����ڷκ��� �� ���� ������ �Է¹޾Ƽ�
		 * ������ ��, ������ ��, ������ ��, ������ ���, ū ��, ���� ���� ����Ͽ� ȭ�鿡 ����ϴ� ���α׷� �ۼ�
		 * ū ���� ���� ���� ���� ���� ���ǿ�����(���׿�����)�� ����Ͻÿ�
		 */
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("x�� �Է��Ͻÿ�: "); //print:���� �ٲ��� �ʴ´�
		x = sc.nextInt(); // ���� �Է�
		
		System.out.print("y�� �Է��Ͻÿ�: ");
		y = sc.nextInt();
	
//		double avg = (double)(x + y) / 2;
		
		System.out.println("�� ���� �� : " + (x + y)); //���� ���
		System.out.println("�� ���� �� : " + (x - y)); //���̸� ���
		System.out.println("�� ���� �� : " + (x * y)); //���� ���
//		System.out.println("�� ���� ��� : " + avg);	//����� ���
		System.out.println("�� ���� ��� : " + ((double)(x + y)/2));
		System.out.println("ū �� : " + (x > y ? x : y)); //ū �� ���
		System.out.println("���� �� : " + (x < y ? x : y)); //���� �� ���

	}

}
