package ch_03_operator;

import java.util.Scanner;

public class add_01InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner.nextLine() : 문자열 입력
		 */
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		name = sc.nextLine(); //문자열 입력
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();	//정수 입력
		
		System.out.println(name + "님 안녕하세요!" + age + "살이시네요.");

	}

}
