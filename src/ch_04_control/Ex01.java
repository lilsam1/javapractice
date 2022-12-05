package ch_04_control;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 사용자에게 입력받은 정수가 양수인지
		   0인지 음수인지 알려주는 코드를 완성
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("입력받은 숫자는 양수입니다");
		}
		else if(num == 0) {
			System.out.println("입력받은 숫자는 0입니다");
		}
		else {
			System.out.println("입력받은 숫자는 음수입니다");
		}
	}

}
