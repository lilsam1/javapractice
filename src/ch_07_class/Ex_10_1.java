package ch_07_class;

class Students1 {
	String name;
	private String rollno;
	int age;
	
	Students1(String name, String rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
		System.out.println("�л��� �̸�: " + name);
		System.out.println("�л��� �й�: " + rollno);
		System.out.println("�л��� ����: " + age);
		
		System.out.println("Students ��ü�� �����Ǿ����ϴ�");
	}
}

public class Ex_10_1 {
	/*
	 �л��� ��Ÿ���� Ŭ���� Students�� �����
	 �л��� �̸�(name)�� �й�(rollno), ����(age)�� ������
	 �й��� private�� �����Ѵ� 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students1 students1 = new Students1("Kim", "0001", 20);
		/*
		 �л��� �̸� : Kim
		 �л��� �й� : 0001
		 �л��� ���� : 20
		 Students ��ü�� �����Ǿ����ϴ�
		 */

	}

}
