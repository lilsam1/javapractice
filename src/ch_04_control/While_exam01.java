package ch_04_control;

public class While_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while = 조건을 검사하여 조건이 참이면 반복하고 false이면 while문 전체를 벗어남
		/*
		 * for문이 정해진 횟수만틈 반복한다면,
		 * while문은 조건이 true일 경우 계속 반복
		 * 조건식에는 비교 또는 논리 연산식이 주로 오는데
		 * 조건식이 false가 되면 반복을 멈추고 while문을 종료
		 */
		
		//1부터 10까지 출력
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}

	}

}
