package ch_11_innerClass;

interface Anony {
	public void print();
}

public class InnerClass_ex10 {
	public void printB(Anony a) {	// �������̽� AnonyŸ���� ��ü�� �Ű������� �޴� �޼���
		a.print();
	}
	
	/*
	 �ʿ��� ������ �������̽��� ���� Ŭ������ �ν��Ͻ��� ���� �������� �߻�޼��带 ������ �Ŀ� ���
	 �ڹٳ� �ȵ���̵忡�� ������ ������� �͸��� ���� Ŭ������ �̿��Ͽ� ȭ�鿡�� �̺�Ʈ ó���� ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass_ex10 t = new InnerClass_ex10();
		// Anony Ŭ���� �ν��Ͻ��� �� �κп��� �Ͻ������� ���Ǿ� ����
		t.printB(new Anony() {
			@Override
			public void print() {
				System.out.println("�͸� Ŭ���� ������Դϴ�");
			}
		});
	}
}
