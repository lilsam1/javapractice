package ch_03_operator;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �ֿܼ��� �Է��� ���� ���� Scanner Ŭ���� ���
		 */
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�: "); //print:���� �ٲ��� �ʴ´�
		x = sc.nextInt(); // ���� �Է�
		
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�: ");
		
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum); //���� ���

	}

}
