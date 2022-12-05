package ch_04_control;

public class Continue_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue = 현재의 반복을 뛰어넘고 다음 반복을 진행
		//반복이 진행되다 continue문을 만나면 반복문의 끝으로 가서 다음 반복을 계속 수행
		
		//0 ~ 100까지의 홀수만 더함
		int total = 0;
		int num;
		
		for(num = 0; num <= 100; num++) {
			if(num % 2 == 0) {
				continue;
			}
			total += num;
			
			/*
			if(num % 2 == 1) {
				total += num;
			} */
		}
		System.out.println("1부터 100까지의 홀수의 합은 :" + total + "입니다");
		
		
		//간략하게 줄여보기
//		for(num = 1; num <= 100; num += 2) {
//			total += num;
//		}
//		System.out.println("1부터 100까지의 홀수의 합은 :" + total + "입니다");

	}

}
