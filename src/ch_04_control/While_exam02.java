package ch_04_control;

public class While_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 while문으로 변경
		
		int num;
		int sum = 0;
		
		for (num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다");
		
		
		//while문도 초기값, 조건식, 증감식 존재
		num = 1;
		sum = 0;
		
		while(num <= 10) {
			sum += num;
			num ++;
			
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다");

	}

}
