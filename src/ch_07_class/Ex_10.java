package ch_07_class;

class Students {
	String name;
	private String rollno;
	int age;
	
	Students(String name, String rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	public String toString () {
		return "�л��� �̸� : " + name + "\n" + "�л��� �й� : " + rollno + "\n" + "�л��� ���� : " + age + "\n" + "Students ��ü�� �����Ǿ����ϴ�";	
	}
	
}

public class Ex_10 {
	/*
	 �л��� ��Ÿ���� Ŭ���� Students�� �����
	 �л��� �̸�(name)�� �й�(rollno), ����(age)�� ������
	 �й��� private�� �����Ѵ� 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students students = new Students("Kim", "0001", 20);
		System.out.println(students);
		/*
		 �л��� �̸� : Kim
		 �л��� �й� : 0001
		 �л��� ���� : 20
		 Students ��ü�� �����Ǿ����ϴ�
		 */

	}

}
