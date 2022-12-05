package ch_04_control;

public class For_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 문 -특정 횟수동안 작업을 반복하고 싶을 때 사용
		//초기화,조건식,증감식,실행 부분으로 구성
		/*for(초기화; 조건식; 증감식) {
			조건식이 참일 때 실행되는 부분
		}
		*/
		//실행 : 초기화 이후 - 조건식 검사 후 참이면 실행 - 증감식 실행 - 조건식 검사 후 참이면 실행 - 증감식 실행 ... 반복
		
		int sum = 0; //총 합을 담을 변수
		for (int i = 1; i <= 10; i++) {
			System.out.println( "i = " + i + ", sum = " + (sum += i));
		}

	}

}
