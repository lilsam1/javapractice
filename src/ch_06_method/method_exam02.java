package ch_06_method;

import java.util.Scanner;

public class method_exam02 {
	
	static int max(int a, int b, int c) {	//a,b,c�� �ִ밪�� ��ȯ�ϴ� �޼��� // int�� ������ �ڷ����� int���� �ǹ� //int a, b, c�� �Ű�����
		int max= a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;		// ��ȯ��
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method_exam01_method���� �ۼ��� method�� �����ͼ� �����ϱ�
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdin.nextInt();
		System.out.print("���� b : ");
		int b = stdin.nextInt();
		System.out.print("���� c : ");
		int c = stdin.nextInt();
		
		System.out.println("�ִ밪�� " + max(a,b,c) + "�Դϴ�");

	}

}
