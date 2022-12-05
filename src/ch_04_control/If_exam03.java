package ch_04_control;

import java.util.Scanner;

public class If_exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >>> ");
		int age;
		
		age = sc.nextInt();
		
		if (age > 19) { // 20 ~
			System.out.println("성인입니다");
			System.out.println("성인 요금이 적용됩니다");
		}
		else if (age > 13) { // 14 ~ 19	 // 19세 이상의 조건은 앞에서 이미 걸려졌기 때문에 조건에 쓸 필요x 
			System.out.println("청소년입니다");
			System.out.println("청소년 요금이 적용됩니다");
		}
		else if (age > 8) { // 9 ~13
			System.out.println("어린이입니다");
			System.out.println("어린이 요금이 적용됩니다");
		}
		else { // ~ 8
			System.out.println("유아입니다");
			System.out.println("유아 요금이 적용됩니다");
		}
		
		System.out.println("결제를 진행해주세요");
		
		
//		// 반대로 유아부터 적용해보기
//		if (age < 9) { 
//			System.out.println("유아입니다");
//			System.out.println("유아 요금이 적용됩니다");
//		}
//		else if (age < 14) {  
//			System.out.println("어린이입니다");
//			System.out.println("어린이 요금이 적용됩니다");
//		}
//		else if (age < 20) { 
//			System.out.println("청소년입니다");
//			System.out.println("청소년 요금이 적용됩니다");
//		}
//		else { 
//			System.out.println("성인입니다");
//			System.out.println("성인 요금이 적용됩니다");
//		}
//		
//		System.out.println("결제를 진행해주세요");


	}

}
