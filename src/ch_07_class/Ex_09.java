package ch_07_class;

class Person {
	private String name;
	private String mobile;
	private String office;
	private String email;
	
	Person(String name, String mobile, String office, String email) {	// �Ű������� ���� ������
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
	 Ŭ���� �ۼ� �� ���� ����
	 Person�̶�� Ŭ������ �ۼ��ϰ� �׽�Ʈ
	 Person�̶�� Ŭ������ ������ ���� �ʵ�� �޼��带 ����
		 # �ʵ�
		 	name : �̸� (private)
		 	mobile : �ڵ��� ��ȣ (private)
		 	office : ���� ��ȭ��ȣ (private)
		 	email : �̸��� �ּ� (private)
		 	
		 # �޼���
		 	Person(n, m, oi, e) : ������ �޼���
		 	toString() : �ﰢ���� ������ ���ڿ��� ��ȯ�ϴ� �޼���
		 	setName(), getName()... : �� �Ӽ��� ���� �������� ������ �޼���
	 */
	
	// ���콺 �� Ŭ�� - source - genearte �׸� �ִ� �͵� ���� ������ �� �� ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("�ڽ���", "010-1234-5678", "053-123-4567", "test@naver.com");
		System.out.println(person);
		// Person{name='�ڽ���', mobile='010-1234-5678', office='053-123-4567', email='test@naver.com'}
		person.setEmail("test@kakao.com");
		person.setMobile("010-5678-1234");
		System.out.println(person);
		// Person{name='�ڽ���', mobile='010-5678-1234', office='053-123-4567', email='test@kakao.com'}

	}

}
