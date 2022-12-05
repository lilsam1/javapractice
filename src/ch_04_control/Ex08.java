package ch_04_control;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임
		 1) 1부터 1000 사이의 정수 하나를 생성한다
		 2) 사용자가 답을 추측하여 입력한다
		 3) 정답이 아닐 경우, 정답이 입력한 값보다 큰지 작은지 알려준다
		 4) 정답일 경우, 성공 메시지 및 시도 횟수 출력할 것
		 */
		
		//int nextInt(int n); //int 타입의 0 ~ 매개값까지의 난수를 리턴
//		Random random = new Random();
//		answer = random.nextInt(999) + 1;
		
		Scanner sc = new Scanner(System.in);
		int value;
		int count = 0;
		int random = (int)(Math.random() * 999) + 1;
		
		while(true) {
			count++;
			System.out.println("정답을 추측해보세요");
			value = sc.nextInt();
			
			if (value == random) {
				break;
				}
			else if(value > random) {
				System.out.println("제시한 정수가 높습니다");	
			}
			else if(value < random) {
				System.out.println("제수한 정수가 낮습니다");
			}
		}
		System.out.println("정답입니다. 지금까지 " + count + "번 시도하셨습니다.");
	}

}
