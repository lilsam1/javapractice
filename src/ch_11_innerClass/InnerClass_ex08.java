package ch_11_innerClass;

import ch_11_innerClass.InnerClass_ex06.MyOuter3;

/* MyOuter4.test()�� ȣ���ؼ� �Ʒ��� ���� ����� �ǵ��� main() �޼��� �ۼ�
  '������: �̸�: ȫ�浿, ����: 20,�ּ�: ������ ������'
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
				
				return "�̸�: " + name + ", ����: " + age + ", �ּ�: " + address;
			}
		}
		Inner inner = new Inner("������ ������");
		System.out.println("������: " + inner.getCustomerInfo());
	}
}

public class InnerClass_ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter4 myouter4 = new MyOuter4("ȫ�浿", 20);
		myouter4.test();
	}

}
