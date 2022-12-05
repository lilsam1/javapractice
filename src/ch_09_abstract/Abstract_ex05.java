package ch_09_abstract;

abstract class Calculator {
	int num1, num2;
	abstract int calc();
	
	void printResult() {
		System.out.println("calc() 연산의 결과는 " + calc() + "입니다");
	}
}

class MyCalculator extends Calculator {
	int calc() {
		return this.num1 + this.num2;
	}

}
/*
정수형 필드 num1, num2가 있다
num1, num2를 사용하여 특정 계산을 수행하는 int calc() 메서드를 추상 메서드로 정의한다
void printResult() 메서드는
일반 메서드로 calc() 메서드 실행 결과 리턴을 받아 출력하도록 미리 구현한다

1. 이 요구 사항을 충족하는 추상 클래스 Calculator 작성
2. Calculator 추상 클래스를 상속받는 MyCalculator 클래스를 구현
*/
public class Abstract_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.num1 = 10;
		myCalculator.num2 = 20;
		myCalculator.printResult();	// calc() 연산의 결과는 30입니다

	}

}
