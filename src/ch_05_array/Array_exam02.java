package ch_05_array;

import java.util.Scanner;

public class Array_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		int a, b, c, d;
//		int sum;
		
//		System.out.println("1��° ���ڸ� �Է��ϼ��� : ");
//		a = scanner.nextInt();
//		System.out.println("2��° ���ڸ� �Է��ϼ��� : ");
//		b = scanner.nextInt();
//		System.out.println("3��° ���ڸ� �Է��ϼ��� : ");
//		c = scanner.nextInt();
//		System.out.println("4��° ���ڸ� �Է��ϼ��� : ");
//		d = scanner.nextInt();
//		
//		sum = a + b + c + d;
//		
//		System.out.print(" �հ� ==>  " + sum);
//		
//		scanner.close();
		
		
		
		// �迭�� �ٲٱ�
//		Scanner scanner = new Scanner(System.in);
//		int[] num = new int [4];
//		int sum;
//		
//		System.out.println("1��° ���ڸ� �Է��ϼ��� : "); 
//		num[0]= scanner.nextInt();
//		System.out.println("2��° ���ڸ� �Է��ϼ��� : ");
//		num[1]= scanner.nextInt();
//		System.out.println("3��° ���ڸ� �Է��ϼ��� : ");
//		num[2]= scanner.nextInt();
//		System.out.println("4��° ���ڸ� �Է��ϼ��� : ");
//		num[3]= scanner.nextInt();
//		
//		sum = num[0] + num[1] + num[2] + num[3];
//		
//		System.out.println(" �հ� ==> " + sum);
//		
//		scanner.close();
		
		
		
		// ����) �迭�� �ݺ�������
		Scanner scanner = new Scanner(System.in);
		int[] num = new int [4];
		int sum;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i + 1);
			num [i] = scanner.nextInt();
		}
		
		sum = num[0] + num[1] + num[2] + num[3];
		
		System.out.println(" �հ� ==> " + sum);
		
		scanner.close();

	}

}
