package ch_11_innerClass;

class A {
	class InstanceInner {}	// ���� Ŭ����
	
	static class StaticInner {}	// static ���� Ŭ����. ����ƽ ������� ���� ����
	
	StaticInner st1 = new StaticInner();
	
	// �ν��Ͻ� ������� ���� ����
	InstanceInner ii1 = new InstanceInner();
	
	static void saticMethod() {
		// ����ƽ ����� ����ƽ ���� Ŭ������ ���� ����
		StaticInner st2 = new StaticInner();
		
		// ����ƽ ����� �ν��Ͻ� ����� ���� �Ұ�
//		InstanceInner ii2 = new InstanceInner();	// ���� ��
	}
	
	void instanceMethod() {
		// �ν��Ͻ� ����� ��� ���� ����
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
}

public class InnerClass_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
