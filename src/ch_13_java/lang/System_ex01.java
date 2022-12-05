package ch_13_java.lang;

/*
 long currentTimeMillis()
 시스템의 현재 시간을 조사
 조사되는 값은 우리가 흔히 쓰는 시간 포맷이 아니라
 1970년 1월 1일 자정을 기준으로 경과한 에폭 타입 Epoch time 이며 단위는 1/1000초
 시간 단위가 정밀해 리턴 타입은 long 타입
 
 경과 시간이어서 시간 조사용으로 사용하기 보다 연산이 용이해 두 실행 지점 간의 측정에 주로 사용
 */

public class System_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 만 번 출력하는데 걸리는 시간을 측정
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			System.out.println(i + "번쨰 줄");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " 초 걸림");

	}

}
