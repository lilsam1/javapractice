package ch_05_array;

import java.util.Scanner;

public class Array_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		int a, b, c, d;
//		int sum;
		
//		System.out.println("1번째 숫자를 입력하세요 : ");
//		a = scanner.nextInt();
//		System.out.println("2번째 숫자를 입력하세요 : ");
//		b = scanner.nextInt();
//		System.out.println("3번째 숫자를 입력하세요 : ");
//		c = scanner.nextInt();
//		System.out.println("4번째 숫자를 입력하세요 : ");
//		d = scanner.nextInt();
//		
//		sum = a + b + c + d;
//		
//		System.out.print(" 합계 ==>  " + sum);
//		
//		scanner.close();
		
		
		
		// 배열로 바꾸기
//		Scanner scanner = new Scanner(System.in);
//		int[] num = new int [4];
//		int sum;
//		
//		System.out.println("1번째 숫자를 입력하세요 : "); 
//		num[0]= scanner.nextInt();
//		System.out.println("2번째 숫자를 입력하세요 : ");
//		num[1]= scanner.nextInt();
//		System.out.println("3번째 숫자를 입력하세요 : ");
//		num[2]= scanner.nextInt();
//		System.out.println("4번째 숫자를 입력하세요 : ");
//		num[3]= scanner.nextInt();
//		
//		sum = num[0] + num[1] + num[2] + num[3];
//		
//		System.out.println(" 합계 ==> " + sum);
//		
//		scanner.close();
		
		
		
		// 응용) 배열의 반복문으로
		Scanner scanner = new Scanner(System.in);
		int[] num = new int [4];
		int sum;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
			num [i] = scanner.nextInt();
		}
		
		sum = num[0] + num[1] + num[2] + num[3];
		
		System.out.println(" 합계 ==> " + sum);
		
		scanner.close();

	}

}
