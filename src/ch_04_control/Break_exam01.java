package ch_04_control;

import java.util.Scanner;

public class Break_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 반복문을 빠져나오는 방법은 1)조건식이 false가 되거나 2)break 문이 실행되거나
		 * break문은 반복을 멈추게함
		 * 반복문이 진행되다가 break 문을 만나면 곧 바로 반복문을 벗어나 반복문 다음의 코드를 수행
		 */
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) {
			System.out.println("더할 숫자를 입력하세요:(종료하려면 0입력)");
			num = scanner.nextInt(); //정수 입력받아 i에 저장
			if (num == 0) { //만약 0을 입력하였다면 종료
				break;
			}
			sum += num; //입력받은 값 더해주기
		}
		System.out.println("현재까지의 총합 = " + sum);

	}

}
