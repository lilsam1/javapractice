package ch_07_class;

class Cellphone {
	String mode1 = "Galaxy 8";
	String color;
	int capacity;
	
	/* �⺻ ������
	 ��� Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �����ؾ���
	 �����Ϸ��� �ڵ����� '�⺻ ������'�� �߰����༭ ������ ��
	*/
	 
	
	/* �������� Ư¡ 1) Ŭ������ �̸��� ���� 2) ��ȯ���� ���� 3) �ν��Ͻ� ������ �ڵ����� ���� (�� �ѹ�)
	   
	 �����ڸ� �������� ������ void �����ڰ� �⺻���� ����
	 �����ڸ� �����ϸ� �ڹٰ� ������ �Ǵ� void �����ڰ� �����
	 void �����ڸ� ����Ϸ��� ���� ���Ǹ� ������� ��
	*/

	Cellphone(String color, int capacity) {	// �Ű� ������ �ִ� ������
		this.color = color;	
		this.capacity = capacity;
	}
//	Cellphone() {	// �Ű� ������ ���� ������
//	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cellphone myphone1 = new Cellphone();	// ���� �߻� - �Ű� ������ ���� ������ �ۼ��� ����x
		Cellphone myphone = new Cellphone("silver", 64);
		
		System.out.println(myphone.mode1);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
		
		
	
	}

}
