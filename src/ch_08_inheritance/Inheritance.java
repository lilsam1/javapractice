package ch_08_inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 상속 - 새로운 클래스를 작성할 때 기존에 존재하는 클래스의 속성을 물려받는 것
		 클래스가 가진 멤버를 물려받아 코드의 양이 줄어드는 효과. --> 코드의 재사용이 용이하고 코드의 중복을 줄일 수 있음
		 부모 클래스는 자신의 멤버를 자식 클래스 혹은 자손 클래스에 물려주고 상속
		 
		 상속할 때는 새롭게 작성할 클래스 선언 부분 뒤 'extends 부모 클래스 이름'을 붙임
		 class Parents{}
		 class Child extends Parents{}
		 	// Parents 클래스의 멤버들을 Child 클래스가 상속
		 
		 자바에서는 다중상속을 허용하지 않고 단일 상속만 허용함을 주의
		 class Test extends B, extends c{}	
		 	// 에러 발생. 다중상속 불가
		 */
		 
		/*
		 자손 클래스의 생성자 작업을 할 때 부모 클래스의 생성자도 반드시 호출해주어야 함
		 부모 클래스의 생성자 호출은 상위 클래스를 의미하는 super()을 통해 이루어짐. 부모 클래스 호출은 무조건 자식 클래스 생성자 첫 줄에서 이루어짐
		 만약 자식의 생성자 내부에 부모 클래스의 생성자를 따로 작성하지 않더라도 자동적으로 자식 클래스의 생성자 첫 줄에 super();을 추가
		 */
		
		/*
		 Object 클래스 - 모든 클래스의 조상인 클래스
		 모든 클래스는 Object 클래스를 자동으로 상속함으로 Object 클래스 내부에 정의된 멤버들을 사용할 수 있음  ex)toString(), equal()

		 */

	}

}
