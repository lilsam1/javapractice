package ch_08_inheritance;

public class AccessModifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 접근 제어자 - 외부에서 접근할 수 수 있는 정도의 범위를 정함
		 public, protected, default,private 순서로 허용 범위가 넓음. 아무런 접근 제어자를 작성하지 않았을 경우 default 적용
		 
		 public : 접근 제한이 없음
		 protected : 같은 패키지 내에서와 자손 클래스에서 접근 가능
		 default: 같은 패키지 내에서만 접근 가능
		 private: 같은 클래스 내에서만 접근 가능
		 
		 private 접근 방법 - 클래스 내부에 getter,setter 메서드를 구현해 간접적으로 값에 접근
		 		getter - 반환 ,setter - 변수의 값을 설정 		
		 */
		
		
		/*
		 static 제어자 - 변수나 메서드 앞에 붙으며 이 멤버가 클래스 멤버라는 것을 의미
		 
		 클래스 멤버는 처음 클래스가 메모리에 로드될 때 생성되기 때문에 인스턴스를 생성하지 않아도 사용이 가능
		 */
		
		/*
		 final - final이 붙으면 내용이나 값을 변경하지 못하게 됨
		 
		 final 변수: 값을 더 이상 변경할 수 없는 상수
		 final 메서드: 내용을 더 이상 변경할 수 없는 메서드. 오버라이딩 불가
		 final 클래스: 내용을 더 이상 변경할 수 없는 클래스. 상속 불가
		 */

	}

}
