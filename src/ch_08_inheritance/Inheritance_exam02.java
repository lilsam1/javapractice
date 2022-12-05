package ch_08_inheritance;

class Tv {
	boolean power;	// ��������(on/off)
	int channel;	// ä��
	
	void power() { power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel;}
}

class CaptionTv extends Tv {
	boolean caption;	// ĸ�ǻ���(on/off)
	void displayCaption(String text) {
		if (caption) {	// ĸ�ǻ��°� on(true)�� ���� text�� �����ش�
			System.out.println(text);
		}
	}
}

public class Inheritance_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;					// ���� Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();					// ���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");	// boolean �ʱⰪ�� false���� ĸ�� ���x
		ctv.caption = true;					// ĸ�� ����� �Ҵ�
		ctv.displayCaption("Hello, World");	// ĸ���� ȭ�鿡 ���� �ش�

	}

}
