package ch_11_innerClass;

/* 로컬 내부 클래스
 외부 클래스의 메서드 내에서 정의된 클래스
 메서드 호출 시에 생성되고 복귀하면 소멸
 
 메서드의 지역 변수는 스택메모리에서 실행되므로 호출 후 복귀하면 소멸
 하지만 지역 내부 클래스의 객체는 힙에서 실행이 되므로 메서드 호출이 끝나고 복귀하더라도 살아있음
 
 로컬 내부 클래스는 프로그래밍에서 거의 사용하지 않음. 이런 내부 클래스가 있다는 정도만 알아두는 정도
 */
class OutClass2 {
	// Runnalbe 인터페이스를 구현하는 클래스를 지역 내부 클래스로 만든 예제
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {	// 반환형이 Runnable인 메서드
		int num = 100;
		// Runnalbe 인터페이스는 자바에서 스레드를 만들 때 사용하는 인터페이스
		// java.lang 패키지에 선언되어 있으며 반드시 run() 메서드를 구현해야 함
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				// 지역 내부 클래스가 선언된 메서드의 지역변수는 사용하지 못함
//				num = 200;	// 에러. 지역변수는 상수로 바뀜. 값은 변경 못하지만 보는 것은 가능
//				i = 100;	// 에러. 매개 변수 역시 지역변수처럼 상수로 바뀜. 값은 변경 못하지만 보는 것은 가능
				System.out.println("i = " + i);	// 값은 변경 못해도 보는 것은 가능
				System.out.println("num = " + num);	// 값은 변경 못해도 보는 것은 가능
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + OutClass2.sNum + "(외부 클래스 정적 변수)");	
			}
		}
		return new MyRunnable();
	}
}

public class InnerClass_ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass2 out = new OutClass2();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
