package ch_13_java.lang;

/*
 Member Ŭ�������� id�� �̸�, ����ó�� �����ϴ� �ʵ尡 �ִ�
 Member Ŭ������ �ۼ��ϵ�, Object�� toString() �޼��带 �������ؼ� �Ʒ��� ���� �������� �ۼ�
 
 ���� ��� :
 blue: ���Ķ�
 */
class Member {
	String id, name, tel;
	
	Member(String id, String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " : " + name ;
	}
}

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("blue", "���Ķ�", "010-1234-5678");
		System.out.println(member);

	}

}
