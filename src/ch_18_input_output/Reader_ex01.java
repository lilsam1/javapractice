package ch_18_input_output;

import java.io.FileReader;
import java.io.IOException;

public class Reader_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		FileReader
		FileReader(String name) : ���� �̸� name(��� ǥ��)�� �Ű������� �޾� �Է� ��Ʈ���� ����
		FileReader(File f) : File Ŭ���� ������ �Ű������� �޾� �Է� ��Ʈ���� ����
		
		���� ��Ʈ�� FileReader�� ������ �ѱ��� ����� ����
		*/
		
		try(FileReader fr = new FileReader("./sample_file/reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
