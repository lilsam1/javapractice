package ch_10_interface;

/* 인터 페이스만 수정
 자바 7까지는 인터페이스에서 추상메서드와 상수 , 두 가지 요소만 선언해서 사용할 수 있음
 여러 클래스에 같은 기능을 제공하는 경우에도 추상 메서드를 선언하고 각 클래스마다 똑같이 코드를 넣어 구현해야함
 
 자바 8부터는 인터페이스 활용성을 높이기 위해 디폴트 메서드와 정적 메서드 기능을 제공
 -디폴트 메서드는 인터페이스에서 구현 코드까지 작성한 메서드로 인터페이스를 구현한 클래스에 기본적으로 제공
  인터페이스에서 구현하지만, 이후 인터페이스를 구현한 클래스가 생성되면 그 클래스에서 사용
 -정적 메서드는 인스턴스 생성과 상관없이 사용할 수 있는 메서드. 사용할 때는 인터페이스 이름으로 직접 참조하여 사용
 
 
 자바 9부터는 인터페이스에 private 메서드를 구현할 수 있음
 private 메서드는 인터페이스를 구현한 클래스에서 사용하거나 재정의할 수 없음
 따라서 기존에 구현된 코드를 변경하지 않고 인터페이스를 구현한 클래스에서 공통으로 사용하는 경우 private 메서드를 사용하면 코드 재사용성을 높일 수 있음
 또한 클라이언트 프로그램에 제공할 기본 기능을 private 메서드로 구현하기도 함
 */

interface Calc {	// 인터페이스 만들기
	// 인터페이스에서 선언된 변수는 컴파일 과정에서 상수로 변환됨
	double PI = 3.14;
	int ERROR = -999999999;
	
	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상메서드로 변환됨
	int add(int num1, int num2);
	int substact(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 인터페이스에 디폴트 메서드 구현
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
		myMethod();
	}
	
	// 정적 메서드 구현
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {	// 디폴트 메서드에서 사용
		System.out.println("private 메서드입니다");
	}
	
	// private 메서드는 코드를 모두 구현해야 하므로 추상메서드에는 private 예약어를 사용할 수 없음
	// static 예약어는 함께 사용 가능
	private static void myStaticMethod() {	// 정적 메서드에서 사용
		System.out.println("private static 메서드입니다");
	}
}

abstract class Calculator implements Calc {
	// 인터페이스를 구현한 추상클래스
	// 추상클래스의 경우 인터페이스의 모든 추상 메서드를 구현하지 않아도 됨

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substact(int num1, int num2) {
		return num1 - num2;
	}
}

class CompleteCalc extends Calculator {
	// 인터페이스를 구현한 추상클래스를 상속받은 일반 클래스
	// 추상클래스에서 add(), substact()을 구현했으니 times(), divide()만 구현하면 됨

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;	// 어떤 수를 0으로 나누는 경우에 오류를 반환
	}
	
	public void showInfo() {	// CompleteCalc에서 추가로 정의한 메서드
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}
}

public class Interface_ex06 {
	/*
	 인터페이스 interface는 클래스 혹은 프로그램이 제공하는 기능을 명시적으로 선언하는 역할
	 인터페이스는 추상메서드와 상수로만 이루어짐
	 구현된 코드가 없기 때문에 당연히 인터페이스로 인스턴스를 생성할 수 없음
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substact(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr = {1,2,3,4,5};
//		System.out.println(calc.total(arr));
	}
}
