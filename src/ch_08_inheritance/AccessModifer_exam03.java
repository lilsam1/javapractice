package ch_08_inheritance;
/*
 final ����: ���� �� �̻� ������ �� ���� ���
 final �޼���: ������ �� �̻� ������ �� ���� �޼���. �������̵� �Ұ�
 final Ŭ����: ������ �� �̻� ������ �� ���� Ŭ����. ��� �Ұ�
 */

final class FinalClass {
	final int number = 4;		// ���
}

//class extends FinalClass {	// ���� �߻�
class Parents {
	final void finalMethod() {	// �������̵� �Ұ��� �޼���
		System.out.println("��� �Ұ��� �޼���");
	}
}

class Son extends Parents {
//	void finalMethod() {}		// ���� �߻�
}

public class AccessModifer_exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
//		number1.number = 5;		// ����� ���� �Ұ�

	}

}
