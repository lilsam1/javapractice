package ch_07_class;

class Person {
	private String name;
	private String mobile;
	private String office;
	private String email;
	
	Person(String name, String mobile, String office, String email) {	// 매개변수를 가진 생성자
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}
	
	public String toString() {
		return String.format("Person {name=" + name + ", mobile=" + mobile + ", offcie=" + office + ", email=" + email + "}" );
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}

public class Ex_09 {
	/*
	 클래스 작성 및 접근 제어
	 Person이라는 클래스를 작성하고 테스트
	 Person이라는 클래스는 다음과 같은 필드와 메서드를 가짐
		 # 필드
		 	name : 이름 (private)
		 	mobile : 핸드폰 번호 (private)
		 	office : 직장 전화번호 (private)
		 	email : 이메일 주소 (private)
		 	
		 # 메서드
		 	Person(n, m, oi, e) : 생성자 메서드
		 	toString() : 삼각형의 정보를 문자열로 변환하는 메서드
		 	setName(), getName()... : 각 속성에 대한 접근자의 설정자 메서드
	 */
	
	// 마우스 우 클릭 - source - genearte 항목 있는 것들 쓰면 빠르게 할 수 있음
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("박승준", "010-1234-5678", "053-123-4567", "test@naver.com");
		System.out.println(person);
		// Person{name='박승준', mobile='010-1234-5678', office='053-123-4567', email='test@naver.com'}
		person.setEmail("test@kakao.com");
		person.setMobile("010-5678-1234");
		System.out.println(person);
		// Person{name='박승준', mobile='010-5678-1234', office='053-123-4567', email='test@kakao.com'}

	}

}
