package ch_17_java_util_package;

public class CurrentTimeMillis_ex01 {
/* 시간 처리
 자바에서는 시간에 대해 처리할 수 있도록 클래스를 제공
 시간을 다루는 자료형의 값은 long이며, java.util.Calendar 클래스와 java.util.Date, SimpleDataFormat 이 있음
 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* System.currentTimeMillis() : 현재 운영체제의 시각을 long 타입으로 반환
		 반환한 시각은 1970년 1월 1일을 기준으로 했을때 현재까지의 시간이며 1/1000초 단위까지 환산해서 보여줌
		 메서드가 실행되는 순간의 운영체제 시각을 반환하기 때문에 이용을 하면 작업 소요 시간을 측정 가능
		 */
		long start = System.currentTimeMillis();	// 작업을 시작하기 전의 시간 반환
		System.out.println("시작시간:" + start);
		int a = 0;
		for(int i = 1; i < 1000000000; i++) {
			a++;
		}
		long end = System.currentTimeMillis();	// 작업이 끝난 후의 시간 반환
		System.out.println("종료시간:" + end);
		System.out.println("걸린 작업 시간:" + (end - start));
		
//		시작시간:1671151503470
//		종료시간:1671151503472
//		걸린 작업 시간:2
	}

}
