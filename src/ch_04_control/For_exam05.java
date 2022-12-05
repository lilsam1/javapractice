package ch_04_control;

public class For_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용해서 1부터 100까지의 정수 중에서
		// 3의 배수의 총합을 구하는 코드를 작성해 보세요
		
		// 문제 분석
		// for문을 통해 i를 1부터 100까지 먼저 만들어보기
		// 3의 배수 출력되도록 생각해보기 ( ex_ if문을 활용해서 3의 배수만 실행되도록)
		
		//1번쨰
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
		
		//2번째
		sum = 0;
		for(int i = 3 ; i <=100; i += 3) {
			sum += i;
		}
		System.out.println("3의 배수의 합: " + sum);

	}

}
