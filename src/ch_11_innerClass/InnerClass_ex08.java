package ch_11_innerClass;

import ch_11_innerClass.InnerClass_ex06.MyOuter3;

/* MyOuter4.test()를 호출해서 아래와 같이 출력이 되도록 main() 메서드 작성
  '고객정보: 이름: 홍길동, 나이: 20,주소: 세종시 세종구'
 */

class MyOuter4 {
	private String name;
	private int age;
	
	public MyOuter4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return  name;
	}
	public int getAge() {
		return age;
	}
	
	public void test() {
		int num = 4;
		class Inner {
			private String address;
			public Inner(String address) {
				this.address = address;
			}
			public String getCustomerInfo() {
				System.out.println("inner_test()" + num);
				
				return "이름: " + name + ", 나이: " + age + ", 주소: " + address;
			}
		}
		Inner inner = new Inner("세종시 세종구");
		System.out.println("고객정보: " + inner.getCustomerInfo());
	}
}

public class InnerClass_ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter4 myouter4 = new MyOuter4("홍길동", 20);
		myouter4.test();
	}

}
