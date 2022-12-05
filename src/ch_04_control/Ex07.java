package ch_04_control;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* while, break를 사용하여 사용자가 입력한 점수들의 평균을 내는 프로그램을 작성합니다
		 * 만약 작성자가 음수를 입력하면 break에 의하여 반복 투표가 종료되게 합니다
		 */
		
		//좋은 코드를 작성하는 방법 = 불필요한 코드를 줄이고, 연산횟수를 줄이고, 메모리를 덜 차지하도록
		
		Scanner sc = new Scanner(System.in);
		int grade;
		int total = 0;
		int count = 0;
		
		while (true) {
			System.out.println("점수를 입력하세요");
			grade = sc.nextInt();
			if (grade < 0) {
				break;
				}
			total += grade;
			count++;
		}
		System.out.println("입력한 점수의 평균은 " + total / (double) count + "입니다");
	}

}