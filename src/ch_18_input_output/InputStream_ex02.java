package ch_18_input_output;

import java.io.IOException;

public class InputStream_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ǥ�� �����
		// ȭ�鿡 ����ϰ� �Է¹޴� ǥ�� ����� Ŭ����
		
		// ���� ���� ���� �Է¹ޱ�
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ���缼��");
		
		int i;
		try {
			// read()�� ��ȯ���� int
			while ((i = System.in.read()) != -1) {	// System.in : ǥ�� �Է� ��Ʈ��
				System.out.println((char)i);	// System.out : ǥ�� ��� ��Ʈ��
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
