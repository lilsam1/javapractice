package ch_07_class;

/*
 public : ���� ������ ����
 protected : ���� ��Ű�� �������� �ڼ� Ŭ�������� ���� ����
 default : ���� ��Ű�� �������� ���� ����
 private : ���� Ŭ���� �������� ���� ����
 */

class User {
	private String name;
	private int age;
	
	User(String name, int age) {	// �Ű������� ���� ������
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}

}

public class Inheritance_exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("ö��", 20); // �ν��Ͻ� ����
		User user2 = new User("����", 19); // �ν��Ͻ� ����
		
//		user2.age = 1000;	// �����߻�. ���� ���� �Ұ�
		
		user2.setAge(20);
		System.out.println(user1.getName() + "�� ���̴� " + user1.getAge());
		System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());
		

	}

}