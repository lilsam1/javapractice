package ch_07_class;

public class Class_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t;				// Tv �ν��Ͻ��� �����ϱ� ���� ���� t ����
		t = new Tv();		// Tv �ν��Ͻ� ����
		t.channel = 7;		// Tv �ν��Ͻ��� ������� channel�� ���� 7��
		t.channelDown();	// Tv �ν��Ͻ��� �޼��� ChannelDown()�� ȣ��
		System.out.println("���� ä���� " + t.channel + "�Դϴ�");		// ���� ä���� 6 �Դϴ�

	}

}
