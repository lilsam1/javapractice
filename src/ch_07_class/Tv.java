package ch_07_class;

public class Tv {
	// Tv�� �Ӽ�(�������)
	String color;	// ����
	boolean power;	// ��������(on/off)
	int channel;	// ä��
	
	// Tv�� ���(�޼���)
	void power() {			// Tv�� �Ѱų� ���� ����� �ϴ� �޼���
		power = !power;
	}
	void channelUp() {		// Tv�� ä���� ���̴� ����� �ϴ� �޼���
		++channel;
	}
	void channelDown() {	// Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
		--channel;
	}

}
