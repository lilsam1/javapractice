package ch_04_control;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 사용자에게 성적을 입력받아
		 * if문을 사용해서 학점을 출력하는 코드를 완성하세요
		 * 입력은 0 ~ 100까지 입력이 됩니다
		 * 기준은 아래와 같습니다
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : 0 ~ 59
		 */
		//자바스크립트 유효성 검사로 100까지 범위만 입력받는다 가정
		//코드 줄일 수 있는 부분 생각해보고 간략하게 적기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요");
		int grade = sc.nextInt();
		
		if (grade >= 90) {
			System.out.println("학점 : A");
		}
		else if (grade >= 80) {
			System.out.println("학점 : B");
		}
		else if (grade >= 70) {
			System.out.println("학점 : C");
		}
		else if (grade >= 60) {
			System.out.println("학점 : D");
		}
		else {
			System.out.println("학점 : F");
		}

	}

}
