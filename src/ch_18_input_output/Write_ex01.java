package ch_18_input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_ex01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		Write(byte[] b) �޼��� ����ϱ�
		��µ� �Է°� ���������� ���� �ڷḦ �Ѳ����� ����ϸ� ȿ������ �Ӵ��� ����ð��� �پ��
		write(byte[] b) �޼���� ����Ʈ �迭�� �ִ� �ڷḦ �Ѳ����� ��� 
		 */
		try(FileOutputStream fos = new FileOutputStream("./output_file/output2.txt")){
			byte[] bs = new byte[26];
			byte data = 65;		// 'A'�� �ƽ�Ű ��
			for(int i = 0; i < bs.length; i++) {	// A-Z���� �迭�� �ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs);	// �迭 �Ѳ����� ���
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�");
	}

}
