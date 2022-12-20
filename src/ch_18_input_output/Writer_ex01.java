package ch_18_input_output;

import java.io.FileWriter;
import java.io.IOException;

public class Writer_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		FileWriter
		�����ڸ� ����ؼ� ��Ʈ���� ����
		
		FileWriter(String name) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����'
		FileWriter(String name, boolean append) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ�� ����
		append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false
		
		FileWriter(File f) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����
		FileWriter(String name, boolean append) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ�� ����
		append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false
		*/
		
		try(FileWriter fw = new FileWriter("./output_file/writer.txt")) {
			fw.write('A');	// ���� �ϳ� ���
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);	// ���� �迭 ���
			fw.write("�ȳ��ϼ���. �� �����׿�");	// String ���
			fw.write(buf, 1, 2);	// ���� �迭�� �Ϻ� ���
			fw.write("65");	// ���ڸ� �״�� ���
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�");

	}

}
