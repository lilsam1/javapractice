package ch_08_inheritance;
/*
 final 변수: 값을 더 이상 변경할 수 없는 상수
 final 메서드: 내용을 더 이상 변경할 수 없는 메서드. 오버라이딩 불가
 final 클래스: 내용을 더 이상 변경할 수 없는 클래스. 상속 불가
 */

final class FinalClass {
	final int number = 4;		// 상수
}

//class extends FinalClass {	// 에러 발생
class Parents {
	final void finalMethod() {	// 오버라이딩 불가한 메서드
		System.out.println("상속 불가한 메서드");
	}
}

class Son extends Parents {
//	void finalMethod() {}		// 에러 발생
}

public class AccessModifer_exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
//		number1.number = 5;		// 상수는 변경 불가

	}

}
