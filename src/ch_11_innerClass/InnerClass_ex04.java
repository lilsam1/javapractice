package ch_11_innerClass;

import ch_11_innerClass.MyOuter1.Inner;

/* 인스턴스 내부 클래스의 정의와 형식
 외부 클래스의 멤버처럼 정의된 클래스
 내부 클래스를 사용하려면 먼저 외부 클래스의 인스턴스를 생성한 후 접근해야 함
  : 외부 클래스의 인스턴스 생성 -> 내부 클래스의 인스턴스 생성
 */

// Inner.getCustomerInfo()를 호출해서 아래 내용이 나오도록 main() 메서드 작성
// '고객정보 >> 이름: 홍길동, 나이: 20, 주소: 세종시 세종구'

class MyOuter1 {
	private String name;
	private int age;
	
	public MyOuter1( String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// 내부 클래스 정의
	public class Inner{
		private String address;
		public Inner(String address) {
			this.address = address;
		}
		
		public String getCustomerInfo() {
			return "이름: " + name + ", 나이:" + age + ", 주소:" + address;
		}
	}
}

public class InnerClass_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter1 myOuter1 = new MyOuter1("홍길동", 20);
		MyOuter1.Inner inner = myOuter1.new Inner("세종시 세종구");
		System.out.println("고객정보 >>>" + inner.getCustomerInfo());
	}

}
