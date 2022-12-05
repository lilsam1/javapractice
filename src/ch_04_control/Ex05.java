package ch_04_control;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 음수가 입력될 때까지
		 * 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성
		 * while문을 사용하고, break는 사용하지 말것
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;	//while문의 조건이 1) 처음에 참이 되어야 하고 2)참에 영향을 미치지 않아야 함
		
		while(num >= 0) {
			sum += num;
			System.out.println("정수를 입력");
			num = sc.nextInt();
			
		}
		System.out.println("정수의 합계는 " + sum + "입니다");

	}

}
